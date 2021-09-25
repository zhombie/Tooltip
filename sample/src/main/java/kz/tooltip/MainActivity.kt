package kz.tooltip

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<MaterialButton>(R.id.button)
        button.setOnClickListener {
            Tooltip.on(button)
                .animation(R.anim.fade_in, R.anim.fade_out)
                .arrowSize(20, 20)
                .clickToHide(true)
                .color(Color.parseColor("#0F0F2B"))
                .corner(20)
                .overlay(ResourcesCompat.getColor(resources, android.R.color.transparent, theme)) { _, tooltip ->
                    tooltip.close()
                }
                .padding(10, 14, 10, 14)
                .position(Position.BOTTOM)
                .text("Ваш пароль должен содержать цифры буквы завязку развитие кульминацию и неожиданный финал")
                .textSize(13F)
                .shadow(0F, Color.parseColor("#00000000"))
                .show(3000)
        }
    }

}