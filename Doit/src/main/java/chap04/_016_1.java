package chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*핵심 아이디어는 한 원소가 있을때 왼쪽으로 얼마나 이동하는가.*/
public class _016_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Data[] A = new Data[N];
        for (int i = 0; i < N; i++) {
            A[i] = new Data(i, Integer.parseInt(br.readLine()));
        }
        Arrays.sort(A);

        int maxIndex = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (maxIndex < A[i].index - i) {
                maxIndex = A[i].index - i;
            }
        }
        System.out.println(maxIndex + 1);
        // 플래그가 마지막에 for문에 한번 들어가야 false

    }
}
/*10 01 05 02 03
 * 0  1  2  3  4
 *
 * 01 02 03 05 10
 *  1  3  4  2  0
 * 뒤에서 앞을 빼면
 * 1 2 2 -1 -4
 * 양수는 왼쪽으로 이동했다는 의미
 * 음수는 오른쪽으로 이동했다는 의미
 * 왼쪽으로 가장 많이 이동한 값이 답을 향하는 방향
 *
 * 다만 왼쪽으로 이동 했을때는
 * 그 index 는 change 가 true 인 상태임.
 * -> 이동 한번이라도 하면 change 가 true
 * 이제 다음 for 문에 진입하기 위해 index ++ 해주고
 * change는 이제 false 일테니깐 탈출 할것입니다.
 *
 * 왼쪽으로 가장 많이 이동한 값이 true인 이유는
 * 버블정렬은 인접한 원소 좌우로만 비교하기 때문에
 * 가장 많이 이동한 횟수가 4번 이라고 하면
 * 나머지 1번,2번,3번은 이동이 끝나있기 때문이다.
 * `아직 이동을 해야 하는 값이 있다`라고 생각하면 된다.
 *
 * 또한
 * 버블정렬에서 앞쪽으로는 확실히 1칸씩만 이동할 수 있지만
 * 뒤쪽으로는 무한정 밀릴 수 있기때문에 굳이 뒤로가는 횟수를
 * 셀 필요는 없기도 하고. 마찬가지 앞으로 오는걸 카운트 했으면
 * 뒤쪽으로 가는건 자동으로 따라오기도 합니다.
 * */

class Data implements Comparable<Data> {
    public int index;
    public int value;

    Data(int index, int value) {
        this.index = index;
        this.value = value;
    }

    @Override
    public int compareTo(Data o) {
        return this.value - o.value;
        // 내가 큰 값이면 양수이니깐 뒤로 가고
        // 내가 작은 값이면 음수니깐 앞으로 온다.
    }
}
