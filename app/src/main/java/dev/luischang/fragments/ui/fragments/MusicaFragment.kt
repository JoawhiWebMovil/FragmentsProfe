package dev.luischang.fragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.luischang.fragments.R
import dev.luischang.fragments.ui.adapter.SongAdapter
import dev.luischang.fragments.ui.model.SongModel


class MusicaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_musica, container, false)

        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)
        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = SongAdapter(getSongs())
        return view

    }

    private fun getSongs(): List<SongModel>{
        val lstSong: ArrayList<SongModel> = ArrayList()

        lstSong.add(
            SongModel(1, R.drawable.intheend, "In the end"
                        , "Hybrid Theory", "100.000"
                    , "4:23"))
        lstSong.add(
            SongModel(2, R.drawable.castleofglass, "Castle of Glass"
                , "Hybrid Theory", "200.000"
                , "3:58"))
        lstSong.add(
            SongModel(3, R.drawable.numb, "Numb"
                , "Hybrid Theory", "100.000"
                , "4:23"))
        lstSong.add(
            SongModel(4, R.drawable.onestepcloser, "One step closer"
                , "Hybrid Theory", "98.000"
                , "5:18"))
        lstSong.add(
            SongModel(5, R.drawable.whativedone, "What I've done"
                , "Hybrid Theory", "222.000"
                , "4:10"))
        return lstSong
    }
}