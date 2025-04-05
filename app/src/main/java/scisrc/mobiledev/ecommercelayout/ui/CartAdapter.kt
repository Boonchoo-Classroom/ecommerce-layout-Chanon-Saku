package scisrc.mobiledev.ecommercelayout.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import scisrc.mobiledev.ecommercelayout.R
import scisrc.mobiledev.ecommercelayout.model.CartItem
import android.widget.TextView

class CartAdapter(private val cartItems: List<CartItem>) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.cart_item, parent, false)
        return CartViewHolder(view)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val item = cartItems[position]
        holder.itemName.text = item.name
        holder.itemQuantity.text = "Quantity: ${item.quantity}"
        holder.itemPrice.text = "Price: $${item.price}"
    }

    override fun getItemCount(): Int {
        return cartItems.size
    }

    class CartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemName: TextView = itemView.findViewById(R.id.itemName)
        val itemQuantity: TextView = itemView.findViewById(R.id.itemQuantity)
        val itemPrice: TextView = itemView.findViewById(R.id.itemPrice)
    }
}
