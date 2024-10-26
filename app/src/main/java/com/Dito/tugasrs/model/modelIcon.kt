package com.rizal.tugasrs.model

import com.rizal.tugasrs.R

data class modelIcon(
    val gambar : Int,
    val judul : String
)

object MockList{
    fun getModel() : List<modelIcon>{
        val itemModel1 = modelIcon(
            R.drawable.icontooth,
            "Dentist"
        )

        val itemModel2 = modelIcon(
            R.drawable.iconeye,
            "Ophthalmologyst"
        )

        val itemModel3 = modelIcon(
            R.drawable.iconheart,
            "Cardiologyst"
        )
        val itemModel4 = modelIcon(
            R.drawable.icontooth,
            "Dentist"
        )

        val itemModel5 = modelIcon(
            R.drawable.iconeye,
            "Ophthalmologyst"
        )

        val itemModel6 = modelIcon(
            R.drawable.iconheart,
            "Cardiologyst"
        )





        val itemList : ArrayList<modelIcon> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)


        return itemList


    }

}
