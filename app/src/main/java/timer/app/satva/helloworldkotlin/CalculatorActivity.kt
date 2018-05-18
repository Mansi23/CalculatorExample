package timer.app.satva.helloworldkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_calculator.*
import kotlinx.android.synthetic.main.activity_main.*

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)


    }

    fun calcFunction(view: View) {

        when (view.id) {
            R.id.btnZero -> {
                txtResult.setText("0");
            }
            R.id.btnOne -> {
                txtResult.setText("1")

                // enterValues("1")
//                if (txtResult.text.equals("0")){
//                    txtResult.setText("");
//                }else{
//                    txtResult.setText("1");
//                }
            }
            R.id.btnTwo -> {
                txtResult.setText("2")
           //     enterValues("2")
            }
            R.id.btnThree -> {
             //   enterValues("3")
            }
            R.id.btnFour -> {
              //  enterValues("4")
            }
            R.id.btnFive -> {
              //  enterValues("5")
            }
            R.id.btnSix -> {
                //enterValues("6")
            }
            R.id.btnSeven -> {
               // enterValues("7")
            }
            R.id.btnEight -> {
              //  enterValues("8")
            }
            R.id.btnNine -> {
              //  enterValues("9")
            }
            R.id.btnPlus -> {
                txtAnswer.setText("+")
            }
            R.id.btnMinus -> {
                txtAnswer.setText("-")
            }
            R.id.btnMultiplication -> {
                txtAnswer.setText("*")
            }
            R.id.btnDivision -> {
                txtAnswer.setText("/")
            }
            R.id.btnEqual -> {

            }
            R.id.btnAC -> {

            }
            R.id.btnOpenBraces -> {
                txtAnswer.setText("(")
            }
            R.id.btnCloseBraces -> {
                txtAnswer.setText(")")
            }
            R.id.btnDot -> {
                txtAnswer.setText(".")
            }

        }
    }

    /*fun enterValues(a:String){
        if (txtResult.text.equals("0")){
            txtResult.setText("");
            txtResult.setText(a);
        }else{
            txtResult.setText(a);
        }
    }*/
}
