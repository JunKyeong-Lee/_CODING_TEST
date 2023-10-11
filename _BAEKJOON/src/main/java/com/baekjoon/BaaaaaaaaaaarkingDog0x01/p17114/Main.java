package com.baekjoon.BaaaaaaaaaaarkingDog0x01.p17114;

import java.util.Scanner;

// https://www.acmicpc.net/problem/17114
public class Main {
    public static void main(String[] args) {
        int m, n, o, p, q, r, s, t, u, v, w;
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        o = in.nextInt();
        p = in.nextInt();
        q = in.nextInt();
        r = in.nextInt();
        s = in.nextInt();
        t = in.nextInt();
        u = in.nextInt();
        v = in.nextInt();
        w = in.nextInt();

        int[] zeroCount = {0};

        int rows = n * o * p * q * r * s * t * u * v * w;
        int[][][][][][][][][][][] arr = new int[w][v][u][t][s][r][q][p][o][n][m];
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
                                                    arr[w_][v_][u_][t_][s_][r_][q_][p_][o_][n_][m_] = in.nextInt();
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
            System.out.println(0);
            return;
        }

        int depth = 1;
        int preZeroCount = -1;

        while (true) {
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

        if (zeroCount[0] != 0) {
            System.out.println(-1);
        } else {
            System.out.println(depth - 1);
        }
    }

    public static void fillTomatoes(int depth, int[][][][][][][][][][][] arr, int[] zeroCount, int w_, int v_, int u_, int t_, int s_, int r_, int q_, int p_, int o_, int n_, int m_, int w, int v, int u, int t, int s, int r, int q, int p, int o, int n, int m) {
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
}
