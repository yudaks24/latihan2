package com.example.daftarmahasisswa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> namaMahasiswa = new ArrayList<>();
    private ArrayList<String> nimMahasiswa = new ArrayList<>();
    private ArrayList<String> kelasMahasiswa = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecycleViewAdapter adapter = new RecycleViewAdapter(foto, namaMahasiswa, nimMahasiswa, kelasMahasiswa,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        foto.add("https://pbs.twimg.com/profile_images/988775660163252226/XpgonN0X.jpg");
        namaMahasiswa.add("Yuda Kurnia");
        nimMahasiswa.add("311710517");
        kelasMahasiswa.add("TI.17.B2");

        foto.add("https://irenehelenowski.files.wordpress.com/2013/09/mark.jpg");
        namaMahasiswa.add("Rahmat Friday");
        nimMahasiswa.add("311710096");
        kelasMahasiswa.add("TI.17.B1");

        foto.add("https://arwudaindonesia.files.wordpress.com/2012/01/twittl.jpg");
        namaMahasiswa.add("Ressa Septian");
        nimMahasiswa.add("311710197");
        kelasMahasiswa.add("TI.17.B3");

        foto.add("https://cdn.britannica.com/58/129958-050-C3FE2DD2/Adolf-Hitler-1933.jpg");
        namaMahasiswa.add("Dika Maulana");
        nimMahasiswa.add("311710117");
        kelasMahasiswa.add("TI.17.F2");

        foto.add("https://www.galamedianews.com/media/original/190830100220-terun.jpg");
        namaMahasiswa.add("Rifky");
        nimMahasiswa.add("311710111");
        kelasMahasiswa.add("TI.17.E3");

        foto.add("https://upload.wikimedia.org/wikipedia/commons/9/90/George_H._W._Bush%2C_President_of_the_United_States%2C_1989_official_portrait_%28cropped%29.jpg");
        namaMahasiswa.add("Perol");
        nimMahasiswa.add("311710454");
        kelasMahasiswa.add("TI.17.C5");

        foto.add("https://www.biography.com/.image/t_share/MTE4MDAzNDEwNTQxMTg0NTI2/che-guevara-9322774-1-402.jpg");
        namaMahasiswa.add("Tomi");
        nimMahasiswa.add("311710332");
        kelasMahasiswa.add("TI.17.C1");

        foto.add("https://cdn0-production-images-kly.akamaized.net/qkOvKFccdt1zeZCBt1aqLD9dAFA=/0x139:1920x1221/673x373/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2750066/original/032252500_1552460356-Baim_Wong__8_.jpg");
        namaMahasiswa.add("Dandi");
        nimMahasiswa.add("311710377");
        kelasMahasiswa.add("TI.17.A3");
        prosesRecyclerViewAdapter();

    }
}
