class LowestNumAlgorithm:
    
    def lowest_num(li):
        lowest = li[0]
        highest = li[0]

        for i in range(1,len(li)):
            if lowest > li[i]:
                lowest = li[i]

            if highest < li[i]:
                highest = li[i]
        
        return lowest, highest


    list1 = [5,60,21,7,1,90]
    print(lowest_num(list1))

    #-----algorithm to find second lowest number-----
    def second_lowest_num(li):
        if li[0] < li[1]:
            lowest = li[0]
            second_lowest = li[1]

        else:
            lowest = li[1]
            second_lowest = li[0]

        for i in range(2,len(li)):
            if li[i] < lowest:
                second_lowest = lowest
                lowest = li[i]

            elif li[i] < second_lowest:
                second_lowest = li[i]

        return lowest, second_lowest
    
    print(second_lowest_num(list1))
        
    #----algorithm to find second highest----
    def second_highest(li):
        

        if li[0] > li[1]:
            highest = li[0]
            second_highest = li[1]
        
        else:
            second_highest = li[0]
            highest = li[1]

        for i in range(2,len(li)):
            if highest < li[i]:
                second_highest = highest
                highest = li[i]

            elif second_highest < li[i]:
                second_highest = li[i]

        return highest, second_highest
    
    x = [12,19,9,5,40,45]
    print(second_highest(x))


    #---algorithm to find third lowest number----
    def third_lowest(li):
        if li[0] < li[1] and li[1] < li[2]:
            lowest = li[0]
            second_lowest = li[1]
            third_lowest = li[2]

        elif li[2] < li[1] and li[1] < li[0]:
            lowest = li[2]
            second_lowest = li[1]
            third_lowest = li[0]

        elif li[1] < li[0] and li[0] < li[2]:
            lowest = li[1]
            second_lowest = li[0]
            third_lowest = li[2]

        elif li[1] < li[2] and li[2] < li[0]:
            lowest = li[1]
            second_lowest = li[2]
            third_lowest = li[0]

        elif li[0] < li[2] and li[2] < li[1]:
            lowest = li[0]
            second_lowest = li[2]
            third_lowest = li[1]

        else:
            lowest = li[2]
            second_lowest = li[0]
            third_lowest = li[1]

        for i in range(3,len(li)):
            if lowest > li[i]:
                third_lowest = second_lowest
                second_lowest = lowest
                lowest = li[i]

            elif second_lowest > li[i]:
                third_lowest = second_lowest
                second_lowest = li[i]

            elif third_lowest > li[i]:
                third_lowest = li[i]



        return lowest, second_lowest, third_lowest

    z = [6,20,12,45,15,10,55,5]
    print(third_lowest(z))

    #---algorithm to find second lowest from nested list-----
    def second_lowest_from_nested_list(x):
        if x[0][1] < x[1][1]:
            lowest = x[0][1]
            second_lowest = x[1][1]
        else:
            lowest = x[1][1]
            second_lowest = x[0][1]

        for i in range(2,len(x)):
            if lowest > x[i][1]:
                second_lowest = lowest
                lowest = x[i][1]
            elif second_lowest > x[i][1]:
                second_lowest = x[i][1]

        return lowest, second_lowest

    li1 = [['Munal',25],['Numa',10],['Gaurab',12],['Namita',14],['Suresh',12]]
    print(second_lowest_from_nested_list(li1))



