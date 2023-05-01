package com.example.fitnessapp.Modele

import java.util.UUID

class Exercise {
    var id:String
    var nameExercise: String
    var suggestedNumberSeries: Int?
    var suggestedNumberRepetition: Int?
    var isCategoryLowerPartsBody: Boolean
    var isCategoryUpperPartsBody: Boolean
    var isCategoryStrength: Boolean
    var isCategoryEndurance: Boolean
    var isCategoryCircumferential: Boolean
    var isCategoryFunctional: Boolean
    var isCategoryRelaxing: Boolean




    constructor(nameExercise: String,
                suggestedNumberSeries: Int,
                suggestedNumberRepetition: Int,
                isCategoryLowerPartsBody: Boolean,
                isCategoryUpperPartsBody: Boolean,
                isCategoryStrength: Boolean,
                isCategoryEndurance: Boolean,
                isCategoryCircumferential: Boolean,
                isCategoryFunctional: Boolean,
                isCategoryRelaxing: Boolean){
        this.id =UUID.randomUUID().toString()
        this.nameExercise=nameExercise
        this.suggestedNumberSeries=suggestedNumberSeries
        this.suggestedNumberRepetition=suggestedNumberRepetition
        this.isCategoryLowerPartsBody=isCategoryLowerPartsBody
        this.isCategoryUpperPartsBody=isCategoryUpperPartsBody
        this.isCategoryStrength=isCategoryStrength
        this.isCategoryEndurance=isCategoryEndurance
        this.isCategoryCircumferential=isCategoryCircumferential
        this.isCategoryFunctional=isCategoryFunctional
        this.isCategoryRelaxing=isCategoryRelaxing
    }





}