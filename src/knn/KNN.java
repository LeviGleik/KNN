/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knn;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author levig
 */
public class KNN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int qtde_teste = 15;
        double[][] iris = {{5.1, 3.5, 1.4, 0.2, 1}, {4.9, 3.0, 1.4, 0.2, 1}, {4.7, 3.2, 1.3, 0.2, 1}, {4.6, 3.1, 1.5, 0.2, 1}, {5.0, 3.6, 1.4, 0.2, 1}, {5.4, 3.9, 1.7, 0.4, 1}, {4.6, 3.4, 1.4, 0.3, 1}, {5.0, 3.4, 1.5, 0.2, 1}, {4.4, 2.9, 1.4, 0.2, 1}, {4.9, 3.1, 1.5, 0.1, 1}, {5.4, 3.7, 1.5, 0.2, 1}, {4.8, 3.4, 1.6, 0.2, 1}, {4.8, 3.0, 1.4, 0.1, 1}, {4.3, 3.0, 1.1, 0.1, 1}, {5.8, 4.0, 1.2, 0.2, 1}, {5.7, 4.4, 1.5, 0.4, 1}, {5.4, 3.9, 1.3, 0.4, 1}, {5.1, 3.5, 1.4, 0.3, 1}, {5.7, 3.8, 1.7, 0.3, 1}, {5.1, 3.8, 1.5, 0.3, 1}, {5.4, 3.4, 1.7, 0.2, 1}, {5.1, 3.7, 1.5, 0.4, 1}, {4.6, 3.6, 1.0, 0.2, 1}, {5.1, 3.3, 1.7, 0.5, 1}, {4.8, 3.4, 1.9, 0.2, 1}, {5.0, 3.0, 1.6, 0.2, 1}, {5.0, 3.4, 1.6, 0.4, 1}, {5.2, 3.5, 1.5, 0.2, 1}, {5.2, 3.4, 1.4, 0.2, 1}, {4.7, 3.2, 1.6, 0.2, 1}, {4.8, 3.1, 1.6, 0.2, 1}, {5.4, 3.4, 1.5, 0.4, 1}, {5.2, 4.1, 1.5, 0.1, 1}, {5.5, 4.2, 1.4, 0.2, 1}, {4.9, 3.1, 1.5, 0.1, 1}, {5.0, 3.2, 1.2, 0.2, 1}, {5.5, 3.5, 1.3, 0.2, 1}, {4.9, 3.1, 1.5, 0.1, 1}, {4.4, 3.0, 1.3, 0.2, 1}, {5.1, 3.4, 1.5, 0.2, 1}, {5.0, 3.5, 1.3, 0.3, 1}, {4.5, 2.3, 1.3, 0.3, 1}, {4.4, 3.2, 1.3, 0.2, 1}, {5.0, 3.5, 1.6, 0.6, 1}, {5.1, 3.8, 1.9, 0.4, 1}, {4.8, 3.0, 1.4, 0.3, 1}, {5.1, 3.8, 1.6, 0.2, 1}, {4.6, 3.2, 1.4, 0.2, 1}, {5.3, 3.7, 1.5, 0.2, 1}, {5.0, 3.3, 1.4, 0.2, 1}, {7.0, 3.2, 4.7, 1.4, 2}, {6.4, 3.2, 4.5, 1.5, 2}, {6.9, 3.1, 4.9, 1.5, 2}, {5.5, 2.3, 4.0, 1.3, 2}, {6.5, 2.8, 4.6, 1.5, 2}, {5.7, 2.8, 4.5, 1.3, 2}, {6.3, 3.3, 4.7, 1.6, 2}, {4.9, 2.4, 3.3, 1.0, 2}, {6.6, 2.9, 4.6, 1.3, 2}, {5.2, 2.7, 3.9, 1.4, 2}, {5.0, 2.0, 3.5, 1.0, 2}, {5.9, 3.0, 4.2, 1.5, 2}, {6.0, 2.2, 4.0, 1.0, 2}, {6.1, 2.9, 4.7, 1.4, 2}, {5.6, 2.9, 3.6, 1.3, 2}, {6.7, 3.1, 4.4, 1.4, 2}, {5.6, 3.0, 4.5, 1.5, 2}, {5.8, 2.7, 4.1, 1.0, 2}, {6.2, 2.2, 4.5, 1.5, 2}, {5.6, 2.5, 3.9, 1.1, 2}, {5.9, 3.2, 4.8, 1.8, 2}, {6.1, 2.8, 4.0, 1.3, 2}, {6.3, 2.5, 4.9, 1.5, 2}, {6.1, 2.8, 4.7, 1.2, 2}, {6.4, 2.9, 4.3, 1.3, 2}, {6.6, 3.0, 4.4, 1.4, 2}, {6.8, 2.8, 4.8, 1.4, 2}, {6.7, 3.0, 5.0, 1.7, 2}, {6.0, 2.9, 4.5, 1.5, 2}, {5.7, 2.6, 3.5, 1.0, 2}, {5.5, 2.4, 3.8, 1.1, 2}, {5.5, 2.4, 3.7, 1.0, 2}, {5.8, 2.7, 3.9, 1.2, 2}, {6.0, 2.7, 5.1, 1.6, 2}, {5.4, 3.0, 4.5, 1.5, 2}, {6.0, 3.4, 4.5, 1.6, 2}, {6.7, 3.1, 4.7, 1.5, 2}, {6.3, 2.3, 4.4, 1.3, 2}, {5.6, 3.0, 4.1, 1.3, 2}, {5.5, 2.5, 4.0, 1.3, 2}, {5.5, 2.6, 4.4, 1.2, 2}, {6.1, 3.0, 4.6, 1.4, 2}, {5.8, 2.6, 4.0, 1.2, 2}, {5.0, 2.3, 3.3, 1.0, 2}, {5.6, 2.7, 4.2, 1.3, 2}, {5.7, 3.0, 4.2, 1.2, 2}, {5.7, 2.9, 4.2, 1.3, 2}, {6.2, 2.9, 4.3, 1.3, 2}, {5.1, 2.5, 3.0, 1.1, 2}, {5.7, 2.8, 4.1, 1.3, 2}, {6.3, 3.3, 6.0, 2.5, 3}, {5.8, 2.7, 5.1, 1.9, 3}, {7.1, 3.0, 5.9, 2.1, 3}, {6.3, 2.9, 5.6, 1.8, 3}, {6.5, 3.0, 5.8, 2.2, 3}, {7.6, 3.0, 6.6, 2.1, 3}, {4.9, 2.5, 4.5, 1.7, 3}, {7.3, 2.9, 6.3, 1.8, 3}, {6.7, 2.5, 5.8, 1.8, 3}, {7.2, 3.6, 6.1, 2.5, 3}, {6.5, 3.2, 5.1, 2.0, 3}, {6.4, 2.7, 5.3, 1.9, 3}, {6.8, 3.0, 5.5, 2.1, 3}, {5.7, 2.5, 5.0, 2.0, 3}, {5.8, 2.8, 5.1, 2.4, 3}, {6.4, 3.2, 5.3, 2.3, 3}, {6.5, 3.0, 5.5, 1.8, 3}, {7.7, 3.8, 6.7, 2.2, 3}, {7.7, 2.6, 6.9, 2.3, 3}, {6.0, 2.2, 5.0, 1.5, 3}, {6.9, 3.2, 5.7, 2.3, 3}, {5.6, 2.8, 4.9, 2.0, 3}, {7.7, 2.8, 6.7, 2.0, 3}, {6.3, 2.7, 4.9, 1.8, 3}, {6.7, 3.3, 5.7, 2.1, 3}, {7.2, 3.2, 6.0, 1.8, 3}, {6.2, 2.8, 4.8, 1.8, 3}, {6.1, 3.0, 4.9, 1.8, 3}, {6.4, 2.8, 5.6, 2.1, 3}, {7.2, 3.0, 5.8, 1.6, 3}, {7.4, 2.8, 6.1, 1.9, 3}, {7.9, 3.8, 6.4, 2.0, 3}, {6.4, 2.8, 5.6, 2.2, 3}, {6.3, 2.8, 5.1, 1.5, 3}, {6.1, 2.6, 5.6, 1.4, 3}, {7.7, 3.0, 6.1, 2.3, 3}, {6.3, 3.4, 5.6, 2.4, 3}, {6.4, 3.1, 5.5, 1.8, 3}, {6.0, 3.0, 4.8, 1.8, 3}, {6.9, 3.1, 5.4, 2.1, 3}, {6.7, 3.1, 5.6, 2.4, 3}, {6.9, 3.1, 5.1, 2.3, 3}, {5.8, 2.7, 5.1, 1.9, 3}, {6.8, 3.2, 5.9, 2.3, 3}, {6.7, 3.3, 5.7, 2.5, 3}, {6.7, 3.0, 5.2, 2.3, 3}, {6.3, 2.5, 5.0, 1.9, 3}, {6.5, 3.0, 5.2, 2.0, 3}, {6.2, 3.4, 5.4, 2.3, 3}, {5.9, 3.0, 5.1, 1.8, 3}};
        int teste_classe[];
        int qtde_acrt = 0;
        double distancias[];
        Random random = new Random();
        double[][] ind_treina;
        for (int i = 0; i < qtde_teste; i++) {
            ind_treina = iris;
        }
        double[] ind_teste;
        for(int i = 0; i < (150 - qtde_teste); i++){
            
        }
//        int p1 = random.nextInt(150);
//        int p2 = random.nextInt(150);
//        int p3 = random.nextInt(150);
//        double possivel1[] = iris[p1];
//        double possivel2[] = iris[p2];
//        double possivel3[] = iris[p3];
//        double mPossivel1[] = null;
//        double mPossivel2[] = null;
//        double mPossivel3[] = null;
//        double dPossivel1 = (p1 != 0) ? distanciaAB(possivel1, iris[0]): distanciaAB(possivel1, iris[1]);
//        double dPossivel2 = (p1 != 0) ? distanciaAB(possivel2, iris[0]): distanciaAB(possivel2, iris[1]);
//        double dPossivel3 = (p1 != 0) ? distanciaAB(possivel3, iris[0]): distanciaAB(possivel3, iris[1]);
//        for(int i = 0; i < 150; i++) {
//            if(p1 != i){
//                if(dPossivel1 >= distanciaAB(possivel1, iris[i])){
//                    dPossivel1 = distanciaAB(possivel1, iris[i]);
//                    mPossivel1 = iris[i];
//                }
//            }
//            if(p2 != i){
//                if(dPossivel2 >= distanciaAB(possivel2, iris[i])){
//                    dPossivel2 = distanciaAB(possivel2, iris[i]);
//                    mPossivel2 = iris[i];
//                }
//            }
//            if(p3 != i){
//                if(dPossivel3 >= distanciaAB(possivel3, iris[i])){
//                    dPossivel3 = distanciaAB(possivel3, iris[i]);
//                    mPossivel3 = iris[i];
//                }
//            }
//        }
//        System.out.println("P1: " + p1);
//        System.out.println("Possi1 1: " + possivel1[0]);
//        System.out.println("M possi1 1: " + mPossivel1[0]);
//        System.out.println("D Possil 1: " + dPossivel1);
//        System.out.println("P2: " + p2);
//        System.out.println("Possi1 2: " + possivel2[0]);
//        System.out.println("M possi1 2: " + mPossivel2[0]);
//        System.out.println("D Possil 2: " + dPossivel2);
//        System.out.println("P3: " + p1);
//        System.out.println("Possi1 3: " + possivel3[0]);
//        System.out.println("M possi1 3: " + mPossivel3[0]);
//        System.out.println("D Possil 3: " + dPossivel3);
    }
    private static double distanciaAB(double[] a, double[] b){
        double result = 0;
        for(int i = 0; i < 4; i++) {
            result += Math.pow((a[i] - b[i]), 2);
        }
        result = Math.sqrt(result);
        return result;
    }
    public static int classificarAmostra(double[][] a, double[] b){
        int tam = a.length;
        double dist;
        double dist_ind[] = null;
        for (int i = 0; i < tam; i++) {
            dist = distanciaAB(a[i], b);
            dist_ind[i] = dist;
        }
        Integer[] cont_class = new Integer[3];
        Arrays.fill(cont_class, 0);
        for (int i = 0; i < dist_ind.length; i++) {
            switch ((int) a[i][4]) {
                case 1:
                    cont_class[0]++;
                    break;
                case 2:
                    cont_class[1]++;
                    break;
                default:
                    cont_class[2]++;
                    break;
            }
        }
        int classificacao;
        if(cont_class[0] >= cont_class[1] && cont_class[0] >= cont_class[2]){
            classificacao = 1;
        } else if(cont_class[1] >= cont_class[0] && cont_class[1] >= cont_class[2]){
            classificacao = 2;
        } else{
            classificacao = 3;
        }
        return classificacao;
    }
    private static void shuffleArray(String[][] array) {
        String temp[];
        int index;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
}
