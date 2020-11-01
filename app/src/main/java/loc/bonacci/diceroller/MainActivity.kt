package loc.bonacci.diceroller

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var ivDice: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.btn_roll)
        ivDice = findViewById(R.id.iv_dice)

        btnRoll.text = getString(R.string.activity_main_btn_roll)
        btnRoll.setOnClickListener {
            rollDice()
        }
    }

    //RollDice method, getting random Int from 1 to 6
    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        Log.v("TAG", "RollDice() clicked, result: $randomInt")

        val drawableRes = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        ivDice.setImageResource(drawableRes)
    }
}