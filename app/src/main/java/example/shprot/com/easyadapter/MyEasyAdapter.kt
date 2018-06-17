/*
 *  Created by Oliinyk Volodymyr on 29.05.18 14:45
 *  Copyright (c) 2018 . All rights reserved.
 *  Last modified 29.05.18 14:43
 */

package example.shprot.com.easyadapter

import android.support.annotation.LayoutRes
import com.shprot.easy.adapter.EasyAdapter
import com.shprot.easy.adapter.EasyViewHolder

class MyEasyAdapter(
        @LayoutRes
        itemLayoutRes: Int,
        itemCount: Int,
        binder: (EasyViewHolder) -> Unit = {}
) : EasyAdapter(itemLayoutRes,itemCount, binder)