import java.util.Arrays;
import java.util.Comparator;
/**
 * 必须注意，对数组排序实际上修改了数组本身。例如，排序前的数组是：
 *
 * int[] ns = { 9, 3, 6, 5 };
 * 在内存中，这个整型数组表示如下：
 *
 *       ┌───┬───┬───┬───┐
 * ns───>│ 9 │ 3 │ 6 │ 5 │
 *       └───┴───┴───┴───┘
 * 当我们调用Arrays.sort(ns);后，这个整型数组在内存中变为：
 *
 *       ┌───┬───┬───┬───┐
 * ns───>│ 3 │ 5 │ 6 │ 9 │
 *       └───┴───┴───┴───┘
 * 即变量ns指向的数组内容已经被改变了。
 *
 * 如果对一个字符串数组进行排序，例如：
 *
 * String[] ns = { "banana", "apple", "pear" };
 * 排序前，这个数组在内存中表示如下：
 *
 *                    ┌──────────────────────────────────┐
 *                ┌───┼──────────────────────┐           │
 *                │   │                      ▼           ▼
 *          ┌───┬─┴─┬─┴─┬───┬────────┬───┬───────┬───┬──────┬───┐
 * ns ─────>│░░░│░░░│░░░│   │"banana"│   │"apple"│   │"pear"│   │
 *          └─┬─┴───┴───┴───┴────────┴───┴───────┴───┴──────┴───┘
 *            │                 ▲
 *            └─────────────────┘
 * 调用Arrays.sort(ns);排序后，这个数组在内存中表示如下：
 *
 *                    ┌──────────────────────────────────┐
 *                ┌───┼──────────┐                       │
 *                │   │          ▼                       ▼
 *          ┌───┬─┴─┬─┴─┬───┬────────┬───┬───────┬───┬──────┬───┐
 * ns ─────>│░░░│░░░│░░░│   │"banana"│   │"apple"│   │"pear"│   │
 *          └─┬─┴───┴───┴───┴────────┴───┴───────┴───┴──────┴───┘
 *            │                              ▲
 *            └──────────────────────────────┘
 * 原来的3个字符串在内存中均没有任何变化，但是ns数组的每个元素指向变化了。
 * */
public class ForEachArrayDemo6 {
    public static void main(String[] args) {
        Integer[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        Comparator cmp = new CMP();
        Arrays.sort(ns, cmp);
//        排序后
        System.out.println(Arrays.toString(ns));

    }
}

class CMP implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
//        如果是升序 直接反过来即可
    }
}