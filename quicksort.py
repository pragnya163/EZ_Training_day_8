def quick_sort(lst):
    if len(lst)<1:
        return lst
    else:
        pv=lst[0]
        left=[i for i in lst if i<pv ]
        right=[i for i in lst if i>pv]
        return quick_sort(left)+[pv]+quick_sort(right)
lst=list(map(int,input().split()))
print(quick_sort(lst))