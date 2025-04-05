package scisrc.mobiledev.ecommercelayout.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import scisrc.mobiledev.ecommercelayout.R

class FavoritesFragment : Fragment() {

    private lateinit var favoritesHeader: TextView
    private lateinit var recyclerView: RecyclerView
    private lateinit var addFavoriteButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_favorites, container, false)

        favoritesHeader = rootView.findViewById(R.id.favorites_header)
        recyclerView = rootView.findViewById(R.id.favorites_recycler_view)
        addFavoriteButton = rootView.findViewById(R.id.add_favorite_button)

        addFavoriteButton.setOnClickListener {
        }

        return rootView
    }
}
