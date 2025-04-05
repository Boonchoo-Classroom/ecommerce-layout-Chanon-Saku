package scisrc.mobiledev.ecommercelayout.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import scisrc.mobiledev.ecommercelayout.R
import scisrc.mobiledev.ecommercelayout.ui.adapter.CartAdapter
import scisrc.mobiledev.ecommercelayout.model.CartItem

class CartFragment : Fragment() {

    private lateinit var cartRecyclerView: RecyclerView
    private lateinit var totalPriceText: TextView
    private lateinit var checkoutButton: Button

    private val cartItems = mutableListOf<CartItem>()
    private val cartAdapter = CartAdapter(cartItems)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cart, container, false)

        cartRecyclerView = view.findViewById(R.id.cartRecyclerView)
        totalPriceText = view.findViewById(R.id.totalPrice)
        checkoutButton = view.findViewById(R.id.checkoutButton)

        cartRecyclerView.layoutManager = LinearLayoutManager(context)
        cartRecyclerView.adapter = cartAdapter

        cartItems.add(CartItem("Item 1", 2, 10.0))
        cartItems.add(CartItem("Item 2", 1, 15.0))
        cartItems.add(CartItem("Item 3", 3, 5.0))

        updateTotalPrice()

        checkoutButton.setOnClickListener {

        }

        return view
    }

    private fun updateTotalPrice() {
        val total = cartItems.sumByDouble { it.quantity * it.price }
        totalPriceText.text = "Total: $$total"
    }
}
