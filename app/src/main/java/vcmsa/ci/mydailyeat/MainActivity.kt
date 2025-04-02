package vcmsa.ci.mydailyeat

import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)




        val rbmorning = findViewById<RadioButton>(R.id.rbMorning)
        val rbMmorning = findViewById<RadioButton>(R.id.rbMmorning)
        val rbAfternoon = findViewById<RadioButton>(R.id.rbAfternoon)
        val rbMafternoon = findViewById<RadioButton>(R.id.rbMafternoon)
        val rbDinner = findViewById<RadioButton>(R.id.rbDinner)
        val rbDesserts = findViewById<RadioButton>(R.id.rbDessert)
        val btnC = findViewById<Button>(R.id.btnC)
        val btnR = findViewById<Button>(R.id.btnR)
        val txtResults = findViewById<TextView>(R.id.txtResults)


        btnC.setOnClickListener{

            var txtMu = txtResults.text.toString()

            if (rbmorning.isChecked){
                txtMu="Eggs, Bacon, Waffles, Pancakes"
            }
            else if (rbMmorning.isChecked){
                txtMu="Orange, Strawberry, Apples, Grapes"
            }
            else if (rbAfternoon.isChecked){
                txtMu="Sandwich, Toasted bread, Ginger bread, Bread sticks"
            }
            else if (rbMafternoon.isChecked){
                txtMu="Cake, Cupcakes, Roasted potatoes, peanuts"
            }
            else if (rbDinner.isChecked){
                txtMu="Pasta, Stir fry, Chicken stew, Beef stew"
            }
            else if (rbDesserts.isChecked){
                txtMu="Ice cream, Ice cream sandwich, Malva pudding, Milkshake"
            }
            txtResults.text= txtMu


        }
        btnR.setOnClickListener{
            txtResults.text = ""
        }
















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}