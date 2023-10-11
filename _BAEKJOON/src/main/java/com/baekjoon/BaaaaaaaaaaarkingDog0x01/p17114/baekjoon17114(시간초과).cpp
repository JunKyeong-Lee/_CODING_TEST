// Online C++ compiler to run C++ program online
#include <iostream>

using namespace std;

void fillTomatoes(int depth, int ** ** ** ** ** * arr, int * zeroCount, int w_, int v_, int u_, int t_, int s_, int r_, int q_, int p_, int o_, int n_, int m_, int w, int v, int u, int t, int s, int r, int q, int p, int o, int n, int m) {
    if (arr[w_][v_][u_][t_][s_][r_][q_][p_][o_][n_][m_] == depth + 1)
        return;
    for (int i = -1; i <= 1; i += 2) {
        if (w_ + i >= 0 && w_ + i < w && arr[w_ + i][v_][u_][t_][s_][r_][q_][p_][o_][n_][m_] == 0) {
            arr[w_ + i][v_][u_][t_][s_][r_][q_][p_][o_][n_][m_] = depth + 1;
            zeroCount[0]--;
        }
        if (v_ + i >= 0 && v_ + i < v && arr[w_][v_ + i][u_][t_][s_][r_][q_][p_][o_][n_][m_] == 0) {
            arr[w_][v_ + i][u_][t_][s_][r_][q_][p_][o_][n_][m_] = depth + 1;
            zeroCount[0]--;
        }
        if (u_ + i >= 0 && u_ + i < u && arr[w_][v_][u_ + i][t_][s_][r_][q_][p_][o_][n_][m_] == 0) {
            arr[w_][v_][u_ + i][t_][s_][r_][q_][p_][o_][n_][m_] = depth + 1;
            zeroCount[0]--;
        }
        if (t_ + i >= 0 && t_ + i < t && arr[w_][v_][u_][t_ + i][s_][r_][q_][p_][o_][n_][m_] == 0) {
            arr[w_][v_][u_][t_ + i][s_][r_][q_][p_][o_][n_][m_] = depth + 1;
            zeroCount[0]--;
        }
        if (s_ + i >= 0 && s_ + i < s && arr[w_][v_][u_][t_][s_ + i][r_][q_][p_][o_][n_][m_] == 0) {
            arr[w_][v_][u_][t_][s_ + i][r_][q_][p_][o_][n_][m_] = depth + 1;
            zeroCount[0]--;
        }
        if (r_ + i >= 0 && r_ + i < r && arr[w_][v_][u_][t_][s_][r_ + i][q_][p_][o_][n_][m_] == 0) {
            arr[w_][v_][u_][t_][s_][r_ + i][q_][p_][o_][n_][m_] = depth + 1;
            zeroCount[0]--;
        }
        if (q_ + i >= 0 && q_ + i < q && arr[w_][v_][u_][t_][s_][r_][q_ + i][p_][o_][n_][m_] == 0) {
            arr[w_][v_][u_][t_][s_][r_][q_ + i][p_][o_][n_][m_] = depth + 1;
            zeroCount[0]--;
        }
        if (p_ + i >= 0 && p_ + i < p && arr[w_][v_][u_][t_][s_][r_][q_][p_ + i][o_][n_][m_] == 0) {
            arr[w_][v_][u_][t_][s_][r_][q_][p_ + i][o_][n_][m_] = depth + 1;
            zeroCount[0]--;
        }
        if (o_ + i >= 0 && o_ + i < o && arr[w_][v_][u_][t_][s_][r_][q_][p_][o_ + i][n_][m_] == 0) {
            arr[w_][v_][u_][t_][s_][r_][q_][p_][o_ + i][n_][m_] = depth + 1;
            zeroCount[0]--;
        }
        if (n_ + i >= 0 && n_ + i < n && arr[w_][v_][u_][t_][s_][r_][q_][p_][o_][n_ + i][m_] == 0) {
            arr[w_][v_][u_][t_][s_][r_][q_][p_][o_][n_ + i][m_] = depth + 1;
            zeroCount[0]--;
        }
        if (m_ + i >= 0 && m_ + i < m && arr[w_][v_][u_][t_][s_][r_][q_][p_][o_][n_][m_ + i] == 0) {
            arr[w_][v_][u_][t_][s_][r_][q_][p_][o_][n_][m_ + i] = depth + 1;
            zeroCount[0]--;
        }
    }
}
int main() {
    int m, n, o, p, q, r, s, t, u, v, w;
    cin >> m >> n >> o >> p >> q >> r >> s >> t >> u >> v >> w;

    int zeroCount[1] = {
        0
    };

    int ** ** ** ** ** * arr = new int ** ** ** ** ** [w];
    for (int w_ = 0; w_ < w; w_++) {
        arr[w_] = new int ** ** ** ** * [v];
        for (int v_ = 0; v_ < v; v_++) {
            arr[w_][v_] = new int ** ** ** ** [u];
            for (int u_ = 0; u_ < u; u_++) {
                arr[w_][v_][u_] = new int ** ** ** * [t];
                for (int t_ = 0; t_ < t; t_++) {
                    arr[w_][v_][u_][t_] = new int ** ** ** [s];
                    for (int s_ = 0; s_ < s; s_++) {
                        arr[w_][v_][u_][t_][s_] = new int ** ** * [r];
                        for (int r_ = 0; r_ < r; r_++) {
                            arr[w_][v_][u_][t_][s_][r_] = new int ** ** [q];
                            for (int q_ = 0; q_ < q; q_++) {
                                arr[w_][v_][u_][t_][s_][r_][q_] = new int ** * [p];
                                for (int p_ = 0; p_ < p; p_++) {
                                    arr[w_][v_][u_][t_][s_][r_][q_][p_] = new int ** [o];
                                    for (int o_ = 0; o_ < o; o_++) {
                                        arr[w_][v_][u_][t_][s_][r_][q_][p_][o_] = new int * [n];
                                        for (int n_ = 0; n_ < n; n_++) {
                                            arr[w_][v_][u_][t_][s_][r_][q_][p_][o_][n_] = new int[m];
                                            for (int m_ = 0; m_ < m; m_++) {
                                                cin >> arr[w_][v_][u_][t_][s_][r_][q_][p_][o_][n_][m_];
                                                if (arr[w_][v_][u_][t_][s_][r_][q_][p_][o_][n_][m_] == 0)
                                                    zeroCount[0]++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    if (zeroCount[0] == 0) {
        cout << 0;
        return 0;
    }

    int depth = 1;
    int preZeroCount = -1;

    while (1) {
        for (int w_ = 0; w_ < w; w_++) {
            for (int v_ = 0; v_ < v; v_++) {
                for (int u_ = 0; u_ < u; u_++) {
                    for (int t_ = 0; t_ < t; t_++) {
                        for (int s_ = 0; s_ < s; s_++) {
                            for (int r_ = 0; r_ < r; r_++) {
                                for (int q_ = 0; q_ < q; q_++) {
                                    for (int p_ = 0; p_ < p; p_++) {
                                        for (int o_ = 0; o_ < o; o_++) {
                                            for (int n_ = 0; n_ < n; n_++) {
                                                for (int m_ = 0; m_ < m; m_++) {
                                                    if (arr[w_][v_][u_][t_][s_][r_][q_][p_][o_][n_][m_] == depth) {
                                                        fillTomatoes(depth, arr, zeroCount, w_, v_, u_, t_, s_, r_, q_, p_, o_, n_, m_, w, v, u, t, s, r, q, p, o, n, m);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        depth++;
        if (zeroCount[0] == 0)
            break;
        if (preZeroCount == zeroCount[0])
            break;
        preZeroCount = zeroCount[0];
    }

    for (int w_ = 0; w_ < w; w_++) {
        arr[w_] = new int ** ** ** ** * [v];
        for (int v_ = 0; v_ < v; v_++) {
            arr[w_][v_] = new int ** ** ** ** [u];
            for (int u_ = 0; u_ < u; u_++) {
                arr[w_][v_][u_] = new int ** ** ** * [t];
                for (int t_ = 0; t_ < t; t_++) {
                    arr[w_][v_][u_][t_] = new int ** ** ** [s];
                    for (int s_ = 0; s_ < s; s_++) {
                        arr[w_][v_][u_][t_][s_] = new int ** ** * [r];
                        for (int r_ = 0; r_ < r; r_++) {
                            arr[w_][v_][u_][t_][s_][r_] = new int ** ** [q];
                            for (int q_ = 0; q_ < q; q_++) {
                                arr[w_][v_][u_][t_][s_][r_][q_] = new int ** * [p];
                                for (int p_ = 0; p_ < p; p_++) {
                                    arr[w_][v_][u_][t_][s_][r_][q_][p_] = new int ** [o];
                                    for (int o_ = 0; o_ < o; o_++) {
                                        arr[w_][v_][u_][t_][s_][r_][q_][p_][o_] = new int * [n];
                                        for (int n_ = 0; n_ < n; n_++) {
                                            delete[] arr[w_][v_][u_][t_][s_][r_][q_][p_][o_][n_];
                                        }
                                        delete[] arr[w_][v_][u_][t_][s_][r_][q_][p_][o_];
                                    }
                                    delete[] arr[w_][v_][u_][t_][s_][r_][q_][p_];
                                }
                                delete[] arr[w_][v_][u_][t_][s_][r_][q_];
                            }
                            delete[] arr[w_][v_][u_][t_][s_][r_];
                        }
                        delete[] arr[w_][v_][u_][t_][s_];
                    }
                    delete[] arr[w_][v_][u_][t_];
                }
                delete[] arr[w_][v_][u_];
            }
            delete[] arr[w_][v_];
        }
        delete[] arr[w_];
    }
    delete[] arr;

    if (zeroCount[0] != 0) {
        cout << -1;
    } else {
        cout << depth - 1;
    }
}