package com.example.listelemeodevi

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listelemeodevi.databinding.KartTasarimBinding
import com.google.android.material.snackbar.Snackbar

class UrunlerAdapter(var mContext:Context,var urunlerListesi:List<Urunler>)
    : RecyclerView.Adapter<UrunlerAdapter.KardTasarimTutucu>(){

    inner class KardTasarimTutucu(tasarim:KartTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:KartTasarimBinding
        init{
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = KartTasarimBinding.inflate(layoutInflater,parent,false)
        return KardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: KardTasarimTutucu, position: Int) {
        val urun = urunlerListesi.get(position)
        val t = holder.tasarim

        t.imageViewUrunResim.setImageResource(
            mContext.resources.getIdentifier(urun.urunResimAdi,"drawable",mContext.packageName))
        t.textViewUrunAdi.text = urun.urunAdi
        t.textViewUrunFiyat.text = "${urun.urunFiyat} ₺"
        t.textViewUrunMarka.text = urun.urunMarka
        t.buttonSepeteEkle.setOnClickListener {
            Snackbar.make(it,"${urun.urunAdi} Sepete Eklendi",Snackbar.LENGTH_SHORT)
                .setTextColor(Color.WHITE)
                .setBackgroundTint(Color.rgb(232,100,0))
                .show()
        }
    }

    override fun getItemCount(): Int {
        return urunlerListesi.size
    }
}