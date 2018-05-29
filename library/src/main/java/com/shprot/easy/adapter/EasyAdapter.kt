/*
 *  Created by Oliinyk Volodymyr on 29.05.18 13:55
 *  Copyright (c) 2018 . All rights reserved.
 *  Last modified 29.05.18 13:29
 */

package com.shprot.easy.adapter

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup


abstract class EasyAdapter(
        @LayoutRes
        private val itemLayoutRes: Int,
        private val itemCount: Int,
        private var binder: (EasyViewHolder) -> Unit = {}
) : RecyclerView.Adapter<EasyViewHolder>() {
    override fun getItemCount(): Int = itemCount

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EasyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(itemLayoutRes, parent, false)
        return EasyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: EasyViewHolder, position: Int) {
        holder.also(binder)
    }
}



