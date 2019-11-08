# PagerView

Java android library for viewpager support RTL and simplify the implementation of viewpager .


## Installation

### In Project Level :

```groovy
allprojects {
   repositories {
	...
	maven { url 'https://www.jitpack.io' }
   }
}
```

### In App Module Level :

```groovy
dependencies {
   ...
   implementation 'com.github.AndroThink:PagerView:{version}'
}
```

## Usage

### In Layout XML :

```xml
<com.androthink.viewpager.PagerView
      android:id="@+id/pager"
      android:layout_width="match_parent"
      android:layout_height="match_parent"/>
```

### Then :
```java
List<PagerViewFragment> pagerFragments = new ArrayList<>();
pagerFragments.add(new PagerViewFragment(Fragment1,"Title 1","Tag1"));
pagerFragments.add(new PagerViewFragment(Fragment2,"Title 2","Tag2"));
pagerFragments.add(new PagerViewFragment(Fragment3,"Title 3","Tag3"));

PagerViewAdapter adapter = new PagerViewAdapter(pagerFragments,getFragmentManager());
pager.setAdapter(adapter);


```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
                 Copyright 2019 AndroThink .
                 
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

            http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.