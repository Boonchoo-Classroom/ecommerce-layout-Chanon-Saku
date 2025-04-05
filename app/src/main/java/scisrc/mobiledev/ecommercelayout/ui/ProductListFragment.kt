package scisrc.mobiledev.ecommercelayout.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import scisrc.mobiledev.ecommercelayout.R
import scisrc.mobiledev.ecommercelayout.model.Product
import scisrc.mobiledev.ecommercelayout.databinding.FragmentProductListBinding

class ProductListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var productAdapter: ProductAdapter
    private lateinit var productList: List<Product>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentProductListBinding.inflate(inflater, container, false)

        productList = listOf(
            Product("Pen", 10.0, R.drawable.ic_pen),
            Product("Football", 250.0, R.drawable.ic_football),
            Product("Gadget", 1200.0, R.drawable.ic_gadget),
            Product("T-shirt", 299.0, R.drawable.ic_tshirt)
        )

        recyclerView = binding.recyclerView

        productAdapter = ProductAdapter(productList)

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = productAdapter

        return binding.root
    }
}
