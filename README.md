# AndroidLibraryStudy
databinding参考链接
http://connorlin.github.io/2016/07/02/Android-Data-Binding-%E7%B3%BB%E5%88%97-%E4%B8%80-%E8%AF%A6%E7%BB%86%E4%BB%8B%E7%BB%8D%E4%B8%8E%E4%BD%BF%E7%94%A8/
http://yanghui.name/blog/2016/02/17/data-binding-guide/?utm_source=tuicool&utm_medium=referral

简介
Data binding 在2015年7月发布的Android Studio v1.3.0 版本上引入，在2016年4月Android Studio v2.0.0 上正式支持。
目前为止，Data Binding 已经支持双向绑定了。

Databinding 是一个实现数据和UI绑定的框架，是一个实现 MVVM 模式的工具，有了 Data Binding，
在Android中也可以很方便的实现MVVM开发模式。

Data Binding 是一个support库，最低支持到Android 2.1（API Level 7+）。

Data Binding 之前，我们不可避免地要编写大量的毫无营养的代码，如 findViewById()、setText()，
setVisibility()，setEnabled() 或 setOnClickListener() 等，通过 Data Binding ,
我们可以通过声明式布局以精简的代码来绑定应用程序逻辑和布局，这样就不用编写大量的毫无营养的代码了。

自定义属性设置
一些属性需要自定义 setter 逻辑。例如，目前没有与 android:paddingLeft 对应的 setter，
只有一个 setPadding(left, top, right, bottom) 函数。结合静态 binding adapter 函数与
BindingAdapter 注解可以让开发者自定义属性 setter。

你也可以创建多个参数的 adapter：
// 无需手动调用此函数
@BindingAdapter({"imageUrl", "error"})
public static void loadImage(ImageView view, String url, Drawable error) {
    Glide.with(view.getContext()).load(url).error(error).into(view);
}
<!-- 当url存在时，会自动调用注解方法，即loadImage()-->
<ImageView
    app:imageUrl=“@{url}”
    app:error=“@{@drawable/ic_launcher}”/>
自定义监听
Observable 对象
当一个类实现了 Observable 接口时，Data Binding 会设置一个 listener 在绑定的对象上，以便监听对象字段的变动。
