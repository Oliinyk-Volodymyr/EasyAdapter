/*
 *  Created by Oliinyk Volodymyr on 29.05.18 14:45
 *  Copyright (c) 2018 . All rights reserved.
 *  Last modified 29.05.18 14:43
 */

package com.shprot.example

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.shprot.easy.adapter.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = MyEasyAdapter(itemLayoutRes = R.layout.item,
                itemCount = 100,
                binder = {
                    it.itemView.itemTV.text = ("Position №${it.adapterPosition}")

                    it.itemView.setOnClickListener {

                    }
                })

        RV.layoutManager = LinearLayoutManager(this)

        val layoutManager = LinearLayoutManager(this)
        val dividerItemDecoration = DividerItemDecoration(RV.context,
                layoutManager.orientation)

        RV.itemAnimator = DefaultItemAnimator()
        RV.layoutManager = layoutManager
        RV.addItemDecoration(dividerItemDecoration)
        RV.adapter = adapter
    }
}
