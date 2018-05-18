package timer.app.satva.helloworldkotlin

import android.icu.lang.UCharacter.GraphemeClusterBreak.L
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    //val value1,value2;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun basicMathFunctions(view: View) {
        val value1 = Integer.parseInt(edtValueOne.text.toString())
        val value2 = Integer.parseInt(edtValueTwo.text.toString())

        when (view.id) {
            R.id.btnSum -> {
                Toast.makeText(this, "value 1 : " + value1 + "\n" + "Value 2 : " + value2, Toast.LENGTH_SHORT).show();
                try {
                    var answer: Int;
                    answer = (summation(value1, value2));
                    txtAnswer.setText(answer.toString());
                } catch (e: Exception) {
                    txtAnswer.setText(e.message);
                }
            }
            R.id.btnSub -> {
                Toast.makeText(this, "value 1 : " + value1 + "\n" + "Value 2 : " + value2, Toast.LENGTH_SHORT).show();
                try {
                    var answer: Int;
                    answer = (substraction(value1, value2));
                    txtAnswer.setText(answer.toString());
                } catch (e: Exception) {
                    txtAnswer.setText(e.message);
                }
            }
            R.id.btnMul -> {
                Toast.makeText(this, "value 1 : " + value1 + "\n" + "Value 2 : " + value2, Toast.LENGTH_SHORT).show();
                try {
                    var answer: Long;
                    answer = (multiplication(value1.toLong(), value2.toLong()));
                    txtAnswer.setText(answer.toString());
                } catch (e: Exception) {
                    txtAnswer.setText(e.message);
                }
            }
            R.id.btnDiv -> {
                Toast.makeText(this, "value 1 : " + value1 + "\n" + "Value 2 : " + value2, Toast.LENGTH_SHORT).show();
                try {
                    var answer: Double;
                    answer = (division(value1.toDouble(), value2.toDouble()));
                    txtAnswer.setText(answer.toString());
                } catch (e: Exception) {
                    txtAnswer.setText(e.message);
                }
            }
        }
    }

    fun summation(value1: Int, value2: Int): Int {
        return value1 + value2;
    }

    fun substraction(value1: Int, value2: Int): Int {
        return value1 - value2;
    }

    fun multiplication(value1: Long, value2: Long): Long {
        return value1 * value2;
    }

    fun division(value1: Double, value2: Double): Double {
        return value1 / value2;
    }
}


