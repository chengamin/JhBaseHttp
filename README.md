# JhBaseHttp
基础框架之网络

----

### 使用方式如下:

#### 1. 全局Gradle

```Gradle
	allprojects {
	   	repositories {
			maven { url 'https://jitpack.io' } 
		}
	}
```
#### 2. Module Gradle
```Gradle
	dependencies {
	        implementation 'com.github.chengamin:JhBaseHttp:1.0'
	}
```
----

### 使用方式如下:
```Gradle
	RetrofitWrapper.getInstance("https://www.baidu.com/123/").createService(ApiService.class).baiDu().enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.i("1216",response.body().string().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
```
当然也可以使用RxJava的方式,并不影响使用.
```Gradle
	Observable<BadiBuBean> observable = RetrofitWrapper.getInstance("https://www.baidu.com/123/").createService(ApiService.class).baiDu();
  observable.subscribeOn(Schedulers.io).observeon(AndroidSchedulers.mainThread()).subscribe(--省略--);
```

