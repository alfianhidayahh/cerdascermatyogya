package com.example.aplikascerdascermat;

public class SoalEssay {
    public  String pertanyaan[] = {
            " Diatas merupakan gunung Merapi, yaitu gunung yang berada di provinsi?",
            " Diatas merupakan makanan khis yogyakarta, yaitu?",
            " diatas merupakan Pantai Parangtritis, yaitu pantai yang berada di ?",
            " jalan seperti gambar di atas menjadi salah satu ikon kota yogyakarta, yaitu jalan? ",
            " Tempat seperti gambar di atas adalah ?",
    };

    public String image[] = {
            "merapi",
            "gudeg",
            "parangtritis",
            "malioboro",
            "titiknol",
    };
    private String jawabanBenar[] = {
            "yogyakarta",
            "gudeg",
            "yogyakarta",
            "malioboro",
            "titik nol",
    };

    public String getPertanyaan(int x){
        String soal = pertanyaan[x];
        return soal;
    }

    public String getStringGambar(int x){
        String gambar = image[x];
        return gambar;
    }

    public String getJawabanBenar(int x){
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
