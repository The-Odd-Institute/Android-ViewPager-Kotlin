# Android ViewPager Tutorial (Kotlin)

A tutorial project demonstrating how to implement ViewPager in Android using Kotlin. ViewPager allows users to swipe left and right through multiple pages, similar to iOS scroll views with paging enabled.

![View Pager Demo](https://github.com/AmirJahan/Android-ViewPager-Kotlin/blob/master/ViewPager.gif)

## Overview

This project shows how to create a simple ViewPager with three swipeable pages, each with a distinct background color. It demonstrates the fundamental components needed for ViewPager implementation.

## Technologies

- **Language**: Kotlin
- **Framework**: AndroidX
- **Min SDK**: API 24
- **Target SDK**: API 28

## Key Components

1. **Three Layout Files** - One XML layout per page (`layout_one`, `layout_two`, `layout_three`)
2. **Layout Array** - Stores layout references in MainActivity
3. **PagerAdapter** - Custom adapter that manages page creation and destruction

## Project Structure

```
app/src/main/
├── java/com/oddinstitute/viewpager/
│   └── MainActivity.kt          # Contains MainActivity and MyAdapter
└── res/layout/
    ├── activity_main.xml        # ViewPager container
    ├── layout_one.xml           # Page 1 (orange)
    ├── layout_two.xml           # Page 2 (gray)
    └── layout_three.xml         # Page 3 (blue)
```

## Implementation

### 1. Create Page Layouts

Each page layout uses ConstraintLayout with a centered TextView and unique background color.

### 2. Store Layouts in Array

```kotlin
val myViews: Array<Int> = arrayOf(
    R.layout.layout_one,
    R.layout.layout_two,
    R.layout.layout_three
)
```

### 3. Create PagerAdapter

The adapter implements four key methods:
- `getCount()` - Returns number of pages
- `instantiateItem()` - Inflates and adds each page view
- `destroyItem()` - Removes pages from memory
- `isViewFromObject()` - Verifies view ownership

### 4. Attach Adapter

```kotlin
myViewPager.adapter = MyAdapter(myViews, this@MainActivity)
```

## Usage

1. Clone the repository
2. Open in Android Studio
3. Run on emulator or device
4. Swipe left/right to navigate between pages
