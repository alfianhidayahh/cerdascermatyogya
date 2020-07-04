package com.example.aplikascerdascermat;

public class SoalPilihanGanda {
    public  String pertanyaan[] = {
            "Kota pelajar merupadan julukan kepada kota ?",
            "apakah ikon kota yogyakarta?",
            "Dibawah ini yang merupakan Pantai yang berada di kota Yogyakarta adalah?",
            "pada tahun berapakah yogyakarta berdiri?",
            "Predikat apakah yang di sematkan depada kota yogyakarta ?",
            "Perguruan tinggi dibawah ini yang berada di kota yogyakarta adalah?",
            "Jalan Malioboro berada di kota?",
            "Siapakah Gubernur daerah istimewa Yogyakarta?",
            "Gunung yang berada di yogyakarta?",
            "Makanan apakah yang menjadi makanan khas kota yogyakarta?"
    };

    private  String pilihanJawaban [][] = {
            {"Yogyakarta ", "Semarang ", "Surabaya"},
            {"Tugu", "Monas", "Simpang lima"},
            {"Losari", "Ancol", "Parangtritis"},
            {"1950", "1755", "1887"},
            {"Daerah Khusus Ibukota", "Daerah Istimewa", "Kota seribu sungai"},
            {"Universitas Muhammadiyah Yogyakarta", "Universitas Indonesia", "Univeritas Parahiyangan"},
            {"Makassar", "Medan", "Yogyakarta"},
            {"Tri Rismaharini", "Sri Sultan Hamengkubuwana X", "Ganjar Pranowo"},
            {"Semeru", "Jaya Wijaya", "Merapi"},
            {"Gudeg","Ketoprak","Lupia"},

    };

    private String jawabanBenar [] = {
            "Yogyakarta ",
            "Tugu",
            "Parangtritis",
            "1755",
            "Daerah Istimewa",
            "Universitas Muhammadiyah Yogyakarta",
            "Yogyakarta",
            "Sri Sultan Hamengkubuwana X",
            "Merapi",
            "Gudeg",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    public String getPilihanJawaban1(int x) {
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }
    public String getPilihanJawaban2(int x){
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    public String getPilihanJawaban3(int x){
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
