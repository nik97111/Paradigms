 

import Foundation

var list: [Int] = []

func binarySearch(List: Array<Int>, item: Int) -> Any {
    var minValue = 0
    var maxValue = List.count - 1
    
    
    while minValue <= maxValue {
        let midValue = (minValue + maxValue) / 2
        let guess = List[midValue]
        if guess == item {
            return "Заданное значение найдено по индексу \(midValue + 1)"
        }
        if guess > item {
            maxValue = midValue - 1
        } else {
            minValue = midValue + 1
        }
    }
    return "Заданное значение не существует"
    
}

list = [1, 9, 13, 16, 18, 23, 31, 39, 45, 67, 77, 94, 100]
var result = binarySearch(List: list, item: 77)
print(result)


