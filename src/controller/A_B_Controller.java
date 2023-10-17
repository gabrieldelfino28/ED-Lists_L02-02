package controller;

import fateczl.Lista.model.Lista;

public class A_B_Controller {

    public A_B_Controller() {
        super();
    }

    public void Interseccao(Lista<Integer> A, Lista<Integer> B, Lista<Integer> I) throws Exception {
        int cont = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < B.size(); j++) {
                int v1 = A.get(i);
                int v2 = B.get(j);
                if (v1 == v2) {
                    I.add(v1, cont);
                    cont++;
                }
            }
        }

        //print
        System.out.println("Intersecção: ");
        for (int pos = 0; pos < I.size(); pos++) {
            System.out.print(I.get(pos) + " ");
        }
    }

    public void Uniao(Lista<Integer> A, Lista<Integer> B, Lista<Integer> U) throws Exception {

        for (int i = 0; i < A.size(); i++) {
            U.add(A.get(i), i);
        }

        for (int i = 0; i < B.size(); i++) {
            U.add(B.get(i), i + A.size());

        }
        //print
        System.out.println("\nUnião: ");
        for (int x = 0; x < U.size(); x++) {
            System.out.print(U.get(x) + " ");
        }
    }
}
