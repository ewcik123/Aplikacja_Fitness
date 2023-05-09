package com.example.fitnessapp.AddExercise

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.fitnessapp.MainActivity
import com.example.fitnessapp.Menu.Menu
import com.example.fitnessapp.Modele.Exercise
import com.example.fitnessapp.R

class AddExercise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_exercise)

        val buttonClickBack = findViewById<ImageButton>(R.id.buttonBack)
        buttonClickBack.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

val buttonSaveExercise = findViewById<ImageButton>(R.id.buttonSaveExercise)
        buttonSaveExercise.setOnClickListener {
            var result  : Boolean = checkCorrectOfData()
            if(result){
                //TODO po podłączeniu do bazy sprawdzić czy istnieje ćwiczenie i reagować
                addProduct(this)
            }



        }

    }
    private fun checkCorrectOfData() : Boolean{
        val editTextExercise = findViewById<EditText>(R.id.editTextExerciseName)
        var name = editTextExercise.getText().toString()
        var result = true;


        if(name.isEmpty()){
            result = false;
            alertDialogLackOfData()
        }
        return result
    }

    private fun alertDialogLackOfData() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(getString(R.string.alertDialogTitleLackOfData))
        builder.setMessage(getString(R.string.alertDialogMessageLackOfData))
        builder.setPositiveButton(getString(R.string.back)) { dialog: DialogInterface, which: Int -> }
        builder.show()

    }
 private fun addProduct(view: AddExercise){
     val editTextExercise = findViewById<EditText>(R.id.editTextExerciseName)
     var name = editTextExercise.getText().toString()


     var series = 0
     val editTextSeries = findViewById<EditText>(R.id.editTextNumberOfSeries)
     var numberOfSeries = editTextSeries.getText().toString()
     if(numberOfSeries.isNotEmpty()){
         series = Integer.parseInt(numberOfSeries)
     }

     var repetitions = 0
     val editTextRepetitions = findViewById<EditText>(R.id.editTextRepetition)
     var numberOfRepetitions = editTextRepetitions.getText().toString()
     if(numberOfRepetitions.isNotEmpty()){
         repetitions = Integer.parseInt(numberOfRepetitions)
     }

     val checkBoxCategoryLowerPartsBody = findViewById<CheckBox>(R.id.checkBoxCategoryLowerPartsBody)
     var isCategoryLowerPartsBody = checkBoxCategoryLowerPartsBody.isChecked
     val checkBoxCategoryUpperPartsBody = findViewById<CheckBox>(R.id.checkBoxCategoryUpperPartsBody)
     var iscategoryUpperPartsBody = checkBoxCategoryUpperPartsBody.isChecked
     val checkBoxCategoryStrength = findViewById<CheckBox>(R.id.checkBoxCategoryStrength)
     var isCategoryStrength = checkBoxCategoryStrength.isChecked
     val checkBoxCategoryEndurance = findViewById<CheckBox>(R.id.checkBoxCategoryEndurance)
     var isCategoryEndurance = checkBoxCategoryEndurance.isChecked
     val checkBoxCategoryCircumferential = findViewById<CheckBox>(R.id.checkBoxcategoryCircumferential)
     var isCategoryCircumferential = checkBoxCategoryCircumferential.isChecked
     val checkBoxCategoryFunctional = findViewById<CheckBox>(R.id.checkBoxcategoryFunctional)
     var isCategoryFunctional = checkBoxCategoryFunctional.isChecked
     val checkBoxCategoryRelaxing = findViewById<CheckBox>(R.id.checkBoxcategoryRelaxing)
     var isCategoryRelaxing = checkBoxCategoryRelaxing.isChecked


     var exercises = Exercise(
         name,
         series,
         repetitions,
         isCategoryLowerPartsBody,
         iscategoryUpperPartsBody,
         isCategoryStrength,
         isCategoryEndurance,
         isCategoryCircumferential,
         isCategoryFunctional,
         isCategoryRelaxing
     )

     // TODO jak bedzie baza należy zapisac cwiczenie do bazy
     Toast.makeText(this, getString(R.string.addExercise),Toast.LENGTH_LONG).show()
     alertDialogAddExercise()
 }
    private fun  alertDialogAddExercise(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle(getString(R.string.addExercise))
        builder.setMessage(getString(R.string.alertDialogMessageAddNextExercise))
        builder.setPositiveButton(getString(R.string.yes)) { dialog: DialogInterface, which: Int ->
            findViewById<EditText>(R.id.editTextExerciseName).text.clear()
            findViewById<EditText>(R.id.editTextNumberOfSeries).text.clear()
            findViewById<EditText>(R.id.editTextRepetition).text.clear()
            findViewById<CheckBox>(R.id.checkBoxCategoryLowerPartsBody).isChecked = false;
            findViewById<CheckBox>(R.id.checkBoxCategoryUpperPartsBody).isChecked = false;
            findViewById<CheckBox>(R.id.checkBoxCategoryStrength).isChecked = false;
            findViewById<CheckBox>(R.id.checkBoxCategoryEndurance).isChecked = false;
            findViewById<CheckBox>(R.id.checkBoxcategoryCircumferential).isChecked = false;
            findViewById<CheckBox>(R.id.checkBoxcategoryFunctional).isChecked = false;
            findViewById<CheckBox>(R.id.checkBoxcategoryRelaxing).isChecked = false;
        }
        builder.setNegativeButton(getString(R.string.no)){ dialog: DialogInterface, which: Int ->
            goToMenuActivity()
        }

        builder.show()
    }
    private fun goToMenuActivity(){
        val intent = Intent(this, Menu::class.java)
        startActivity(intent)
    }


}