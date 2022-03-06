package com.projetandroid.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.Fragment
import com.projetandroid.Adaptateur.AlbumAdapter
import com.projetandroid.Adaptateur.ArtistAdapter
import com.projetandroid.AudioDB_API.ApiInterface
import com.projetandroid.R
import com.projetandroid.classes.Album
import com.projetandroid.classes.Artist
import com.projetandroid.conteneur.AlbumElement
import com.projetandroid.conteneur.ArtistElement
import com.projetandroid.convertisseur.AlbumToView
import com.projetandroid.convertisseur.ArtistToView
import com.projetandroid.databinding.FragmentSearchBinding
import com.projetandroid.services.ArtistAPI
import kotlinx.android.synthetic.main.fragment_search.*
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import retrofit2.Call

class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null

    var artistAdapter: ArtistAdapter? = null
    var artistDataset: List<ArtistElement> = ArrayList<ArtistElement>()

    var albumAdapter: AlbumAdapter? = null
    var albumDataset: List<AlbumElement> = ArrayList<AlbumElement>()
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listArtists:List<Artist>
        val listAlbum:List<Album>

        //var searchView = view?.findViewById<SearchView>(R.id.search_searchview)
        search_searchview.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(artistName: String): Boolean {
                val artists = ArtistAPI()
                MainScope().launch {
                    try{
                        val listArtists = async {artists.getArtistsByName(artistName)}
                    }
                    catch (e: Exception){}
                }
                return true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                TODO("Not yet implemented")
            }
        })
    }

    fun updateArtistList(artists: List<Artist>?){
        var artistsCard: List<ArtistElement>? = ArtistToView.convert(artists!!)
        if(artistsCard != null){

            artistAdapter!!.currentResults = artistsCard
            artistAdapter!!.notifyDataSetChanged()
        }
    }

    fun updateAlbumList(albums: List<Album>?){
        var albumsCard: List<AlbumElement>? = AlbumToView.convert(albums)

        parentFragmentManager
        if(albumsCard != null){
            albumAdapter!!.currentResults = albumsCard
            albumAdapter!!.notifyDataSetChanged()
        }
    }*/

}