# exampleWeek2

Неделя 2: Жизненный цикл Activity и Fragment

![image](https://user-images.githubusercontent.com/77270310/179490599-7ef7fa49-f934-4891-bc4a-4bef2d097dcb.png)

![image](https://user-images.githubusercontent.com/77270310/179490766-5274fa1f-755a-4e04-9c0a-9f0ed476b1a5.png)


2.1. Сделать новое мобильное приложение в котором завести два активити, 
одна открывается из другой, и из нее открывается AlertDialog

2.2. Обложить логами методы жизненного цикла активити

2.3. Открывать-закрывать-сворачивать экраны и смотреть что в какой 
последовательности вызывается

2.4. Посмотреть картинку про жизненный цикл Activity в документации, 
выяснить все ли понятно, если что-то непонятно, надо это прояснить

2.5. Посмотреть картинку про жизненный цикл Fragment в документации, 
выяснить все ли понятно, если что-то непонятно, надо это прояснить

```
Activity LifeCycle                           Fragment LifeCycle
onCreate()                                    onAttach()
    |                                              |
onStart()______onRestart()                     onCreate()
    |             |                                |
onResume()        |                            onCreateView()
    |             |                                |
onPause()         |                            onActivityCreated()
    |             |                                |
onStop()__________|                             onStart()
    |                                              |
onDestroy()                                     onResume()
                                                   |
                                                onPause()
                                                   |
                                                onStop()
                                                   |
                                                onDestroyView()
                                                   |
                                                onDestroy()
                                                   |
                                                onDetach()
```

2.6. Выявить отличия жизненного цикла фрагмента от жизненного цикла 
активити, ответить на вопрос - для чего нужны эти отличия, почему они 
возникли?
- Активность - это компонент приложения, который предоставляет пользовательский интерфейс, с которым пользователь может взаимодействовать. Фрагмент является частью действия, которое связывает свой собственный пользовательский интерфейс с этим действием.
- Для планшета или мобильного устройства в альбомной ориентации, используя фрагмент, мы можем отобразить два списка, например, один список для отображения названия состояния, а другой список покажет описание состояния в одном действии, но, используя действие, мы не можем сделать то же самое.
- Активность не зависит от фрагмента. Но фрагмент зависит от Активности, он не может существовать независимо.
без использования фрагмента в Activity мы не можем создать многопанельный интерфейс. Но используя несколько фрагментов в одном действии, мы можем создать многопанельный пользовательский интерфейс.
- Если мы создаем проект с использованием только Activity, то его сложно управлять, но если мы используем фрагменты, структура проекта будет хорошей, и мы легко справимся.
- Деятельность может содержать 0 или несколько фрагментов. Фрагмент можно повторно использовать в нескольких действиях, поэтому он действует как компонент многократного использования в действиях.
- Активность имеет свой жизненный цикл, но фрагмент имеет свой жизненный цикл.
- Для Деятельности мы должны упомянуть в Манифесте, но для фрагмента это не требуется.

2.7. Описать для чего нужен жизненный цикл и какие задачи можно с помощью него решать, 
```
    Жизненный цикл приложения в Android жёстко контролируется системой и зависит от нужд пользователя,
    доступных ресурсов и т. д. Например, пользователь хочет запустить браузер. Решение о запуске
    приложения принимает система. Хотя последнее слово и остаётся за системой, она подчиняется
    определённым заданным и логическим правилам, позволяющим определить, можно ли загрузить,
    приостановить приложение или прекратить его работу. Если в данный момент пользователь работает
    с определённым окном, система даёт приоритет соответствующему приложению. И наоборот, если
    окно невидимо и система решает, что работу приложения необходимо остановить, чтобы
    мобилизовать дополнительные ресурсы, будет прекращена работа приложения, имеющего более
    низкий приоритет. В Android ресурсы более ограниченны, поэтому Android более жёстко
    контролирует работу приложений.
        ОС Android использует иерархию по важности, чтобы определить, какие процессы оставить в
    живых или уничтожить. Понимание жизненного цикла и правильная реакция на изменения его состояния
    имеют решающее значение. Он позволяет создавать приложения с меньшим количеством ошибок,
    использовать меньше системных ресурсов Android и обеспечивать хорошее взаимодействие с пользователем.
```
2.8. Привести 3 примера использования жизненного цикла в реальных 
приложениях
```
    Примеры использования жизненного цикла в реальных приложениях:
    1) Если свернуть приложение YouTube во время просмотра видео, то видео ставится на паузу
    (предположу что в методах onPause и onStop) и приложению уделяется меньше ресурсов.
    2) В приложении Telegram список чатов и само содержание чата находится на разных экранах, но если
    зайти в Telegram в планшета, то на одном экране будет и список чатов и сразу содежримое чата. Это
    делают с помощью фрагментов и предполагаю используют их жизненные циклы(Не уверен что это подохдящий
    пример, но я имел виду что с помощью методов onAttach, onCreate и onCreateView фрагмент будет
    прикрепляться либо к одному экрану(планшеты), либо к разным(телефоны)).
    3) Если закрыть YouTube Music, то метод onDestroy разрушает приложении и музыка перестанет играть,
    что будет экономить ресурсы телефона.
```
