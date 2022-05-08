<h4>Custom DropDownMenu</h4>
<h5>
Modal bottom sheets present a set of choices while blocking interaction with the rest of the screen. They are an alternative to inline menus and simple dialogs, providing additional room for content, iconography, and actions.
</h5>
<br>
<h5>Used</h5>
<ul>
  <li><a href="https://kotlinlang.org/">Kotlin</a></li>
  <li><a href="https://developer.android.com/jetpack/compose">Jetpack Compose</a></li>
</ul>
<h6>There is further customization you can do yourself to this template</h6>
<br>
<h6>Control State</h6>

```
val coroutineScope = rememberCoroutineScope()
val sheetState = rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
```

<h6>Control Visibility</h6>

```
coroutineScope.launch { sheetState.show() }
```

<br>
<br>
<p align="center">
<img src="https://user-images.githubusercontent.com/51417052/167302359-ec5a965c-4fec-4cc3-8d52-d11b6d0b413e.gif" width="300" height="650">
</p>
<br>
<br>
<p align="center">
<img src="https://user-images.githubusercontent.com/51417052/130802494-8c77e65a-601b-4e0b-9c7f-9f16813bc560.png" width="64" height="64"> </a>
<a href="https://developer.android.com/jetpack/compose"> 
<img src="https://user-images.githubusercontent.com/51417052/130803169-5913f0d0-d42d-4446-ab9d-cbe25e8e690f.png" width="64" height="64"> </a>
</p>