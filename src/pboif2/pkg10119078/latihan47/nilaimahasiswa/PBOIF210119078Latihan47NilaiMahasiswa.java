/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan47.nilaimahasiswa;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai = new Nilai();
        
        nilai.setQuiz(75);
        nilai.setUts(45);
        nilai.setUas(60);
        
        System.out.println("QUIZ\t= " + nilai.getQuiz());
        System.out.println("UTS\t= " + nilai.getUts());
        System.out.println("UAS\t= " + nilai.getUas());
        nilai.ket(nilai.index(nilai.nilaiAkhir(nilai.getQuiz(), nilai.getUts(), nilai.getUas())));
        
    }
    
}
