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
public class Nilai {
    private double quiz,uts,uas;
    
    public double getQuiz(){
        return quiz;
    }
    
    public void setQuiz(double quiz){
        this.quiz=quiz;
    }
    
    public double getUts(){
        return uts;
    }
    
    public void setUts(double uts){
        this.uts=uts;
    }
    
    public double getUas(){
        return uas;
    }
    
    public void setUas(double uas){
        this.uas=uas;
    }
    
    public double nilaiAkhir(double quiz, double uts, double uas){
        double nilaiAkhir;
        nilaiAkhir = (0.2 * quiz) + (0.3 * uts) + (0.5 * uas);
        System.out.println("Nilai Akhir = " + nilaiAkhir);
        return nilaiAkhir;
    }
    
    public String index(double nilaiAkhir){
        String index;
        
        if(80 <= nilaiAkhir && nilaiAkhir<=100){
            index = "A";
        } else if (68 <= nilaiAkhir && nilaiAkhir < 80){
            index = "B"; 
        } else if (56 <= nilaiAkhir && nilaiAkhir < 68){
            index = "C";
        } else if (45 <= nilaiAkhir && nilaiAkhir < 56){
            index = "D";
        } else if (0<= nilaiAkhir && nilaiAkhir < 45){
            index = "E";
        } else
            index = "tidak terdefenisi";
        System.out.println("Index\t= " + index);
        return index;
    }
    
    public String ket(String index){
        String ket;
        
        switch (index) {
            case "A":
                ket = "Sangat Baik";
                break;
            case "B":
                ket = "Baik";
                break;
            case "C":
                ket = "Cukup";
                break;
            case "D":
                ket = "Kurang";
                break;
            case "E":
                ket = "Sangant Kurang";
                break;
            default:
                ket = "Tidak Terdefenisi";
                break;
        }
        
        System.out.println("Keterangan = " + ket);
        return ket;
    }
}
