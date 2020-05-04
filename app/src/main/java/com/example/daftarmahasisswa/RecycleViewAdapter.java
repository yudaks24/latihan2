package com.example.daftarmahasisswa;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {

    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> namaMahasiswa = new ArrayList<>();
    private ArrayList<String> nimMahasiswa = new ArrayList<>();
    private ArrayList<String> kelasMahasiswa = new ArrayList<>();
    private Context context;

    public RecycleViewAdapter(ArrayList<String> foto, ArrayList<String> namaMahasiswa, ArrayList<String> nimMahasiswa, ArrayList<String> kelasMahasiswa, Context context) {
        this.foto = foto;
        this.namaMahasiswa = namaMahasiswa;
        this.nimMahasiswa = nimMahasiswa;
        this.kelasMahasiswa = kelasMahasiswa;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(context).asBitmap().load(foto.get(position)).into(holder.imageViewfoto);

        holder.textViewnamaMahasiswa.setText(namaMahasiswa.get(position));
        holder.textnimMahasiswa.setText(nimMahasiswa.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, namaMahasiswa.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, DetailAcivity.class);

                intent.putExtra("foto", foto.get(position));
                intent.putExtra("nama_mahasiswa", namaMahasiswa.get(position));
                intent.putExtra("nim_mahasiswa", nimMahasiswa.get(position));
                intent.putExtra("kelas_mahasiswa", kelasMahasiswa.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return namaMahasiswa.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView imageViewfoto;
        TextView textViewnamaMahasiswa;
        TextView textnimMahasiswa;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewfoto = itemView.findViewById(R.id.imageViewfoto);
            textViewnamaMahasiswa = itemView.findViewById(R.id.textViewnamaMahasiswa);
            textnimMahasiswa = itemView.findViewById(R.id.textViewnimMahasiswa);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
