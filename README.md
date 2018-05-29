# EasyAdapter
[![](https://jitpack.io/v/Denive/EasyAdapter.svg)](https://jitpack.io/#Denive/EasyAdapter)
### Create your recyclerview adapter in just 1 line

- Reduce Boilerplate code to create adapter and holder.
- includes View Events callbacks (ClickEvent,CheckChangeEvent)

Download
--------

* Add jitpack to your project's root build.gradle
```groovy
  allprojects {
    repositories {
      ...
      maven { url 'https://jitpack.io' }
    }
  }
```
* Add the dependency:
```groovy
  dependencies {
    implementation 'com.github.Denive:EasyAdapter:1.0.0'
  }
```

## Usage


``` kotlin
class MyEasyAdapter(
        @LayoutRes
        itemLayoutRes: Int,
        itemCount: Int,
        binder: (EasyViewHolder) -> Unit = {}
) : EasyAdapter(itemLayoutRes, itemCount, binder)
```

#### 1) To Handle recycler View item Events 

``` kotlin
    val adapter = Test(itemLayoutRes = R.layout.item,
      itemCount = 100,
      binder = {
        it.itemView.itemTV.text = ("Position №${it.adapterPosition}")

        it.setOnClickListener {

        }
    })
```

License
=======

    Copyright 2013 DC, Inc.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
