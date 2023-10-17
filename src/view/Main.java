package view;

import controller.A_B_Controller;
import fateczl.Lista.model.Lista;

public class Main {

    public static void main(String[] args) {
        A_B_Controller abc = new A_B_Controller();
        Lista<Integer> A = new Lista<>();
        Lista<Integer> B = new Lista<>();
        Lista<Integer> I = new Lista<>();
        Lista<Integer> U = new Lista<>();

        try{
            //Lista A
            A.addFirst(3);
            A.addLast(5);
            A.addLast(8);
            A.addLast(12);
            A.addLast(9);
            A.addLast(7);
            A.addLast(16);

            //Lista B
            B.addFirst(9);
            B.addLast(6);
            B.addLast(2);
            B.addLast(3);
            B.addLast(7);

            abc.Interseccao(A,B,I);
            abc.Uniao(A,B,U);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
