package com.example.listelemeodevi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.listelemeodevi.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = FragmentAnasayfaBinding.inflate(inflater,container,false)

        tasarim.toolbarAnasayfa.title = ""

        tasarim.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val urunlerListesi = ArrayList<Urunler>()
        val u1 = Urunler(1,"ps5","Sony","Playstation 5",15.887)
        val u2 = Urunler(2,"laptop","Huawei","Matebook 14 AMD Ryzen 5",9877.77)
        val u3 = Urunler(3,"puf","Madam Coco","Beyaz Renk El Örgüsü Puf",299.99)
        val u4 = Urunler(4,"kahve","Karaca","Hatır Kahve Makinesi",579.95)
        val u5 = Urunler(5,"telefon","Xiaomi","Redmi Note 10S Mavi",5499.99)
        val u6 = Urunler(6,"kitap","Kitap","Dijital Kale - Dan Brown",69.99)
        val u7 = Urunler(7,"pastel","Kagito","Highlighter Kalem Seti",21.15)
        urunlerListesi.add(u1)
        urunlerListesi.add(u2)
        urunlerListesi.add(u3)
        urunlerListesi.add(u4)
        urunlerListesi.add(u5)
        urunlerListesi.add(u6)
        urunlerListesi.add(u7)
        val adapter = UrunlerAdapter(requireContext(),urunlerListesi)
        tasarim.rv.adapter = adapter
        return tasarim.root
    }
}