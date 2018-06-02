package com.company;

public class Quick_Sort {

static void sortQuickly(int array[]){

    to_sort_quickly(array,0, array.length-1);

}
    private static void to_sort_quickly(int array[],int low,int high){
 int pointer_I = low, pointer_J =high, temp;
 int  pivIndex = (low+ high)/2;// а что если использовать случайный выбор числа вместо меридиана?)
 int pivot = array[pivIndex];
 do {
     while (array[pointer_I] < pivot)  pointer_I++;//pointer I moving to the right side(high)(coming close element with
     // index high,if the each element of array less than pivot->указатель положения I перемещается вправо с каждым
     // шагом итерации (приближаясь к  элементу с индексом high), если каждый элемент массива меньше опорного элемента
     while(pivot < array[pointer_J])   pointer_J--;//pointer J moving to the left side (low) (coming close to element
     // with, index low),if the each element of array less than pivot->указатель положения J  перемещается влево с
     // каждым шагом итерации (приближаясь к  элементу с индексом low), если каждый элемент массива ,больше опорного
     // элемента
//ВО ВСЕХ СЛУЧАЯХ, ЕСЛИ УСЛОВИЯ,УКАЗАННЫЕ В  НЕ ВЫПОЛНЯЮТСЯ УКАЗАТЕЛИ ПОЛОЖЕНИЯ ОСТАНАВЛИВАЮТСЯ И ПРОИСХОДИТ ОБМЕН ЗНАЧЕ-
// НИЯМИ ИЕЖДУ ОСТАНОВИВШИМИСЯ УКАЗАТЕЛЯМИ
     if (pointer_I <= pointer_J) {//здесь   и выполняется обмен(swap ) здесь можно добавить метод обмен
         temp = array[pointer_I];
         array[pointer_I] = array[pointer_J];
         array[pointer_J] = temp;
         pointer_I++;pointer_J--;// после омена значениями между элементами массива указатели положения продолжают
         // перемещаться в своих определенных направлениях
     }

 } while (pointer_I<=pointer_J);
 //***так как сортировка оборвалась по условию pointer_I<=pointer_J то высываются рекурсивные методы сортировки ,чтобы**
 //   полностью завершить процесс быстрой сортировки , массив разбит на 2 подмассива
        if (low < pointer_J) to_sort_quickly( array, low, pointer_J );// поскольку (ползунок) указатель положения
        // перемещается влево,тем самым он определяет, ограничивает диапозон значений массива
        // между low и  pointer_J [low ;pointer_J]-дабы избежать переполнения памяти (error StackOverflow)
        //тут происходит дополнительная сортировка левой части массива-!!!!!pointer_J  ДОЛЖЕН стремиться к low!!!!!
        if (pointer_I<high) to_sort_quickly(array, pointer_I, high);//// поскольку (ползунок) указатель положения
        // перемещается вправо,тем самым он определяет диапозон значений массива между pointer_I и high [pointer_I; high]
        //тут происходит дополнительная сортировка правой части массива-!!!!!pointer_I ДОЛЖЕН стремиться к

        //P.S если в to_sort_quickly(...):
        // а)  не использовать после завершения цикла уловные операторы  if  то после 1
        // прохода сортировки , цикла, сортировка будет выполнена не полностью;
        //б) !!!!указать не верно в условии(если снять комментарии) , см .пример ниже , то будет появляться ошибка о переполнении памяти:

  //  if(low < pointer_I) to_sort_quickly(array,low,pointer_I);
  //  if (pointer_J< high) to_sort_quickly(array,pointer_J,high);

        //в)!!! если указать в паметрах не верно аргументы то выскочит ошибка о ввходе за пределы массива пример ниже

    //    if(low < pointer_I) to_sort_quickly(array,low,pointer_J);
     //   if (pointer_J< high) to_sort_quickly(array,pointer_I,high);

        }

}
