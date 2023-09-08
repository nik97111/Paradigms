

print("Введите число (n) : ", terminator: "")

if let input = readLine() {
    if var n = Int(input) {
        if n > 0 {
            for i in (1...n) {
                for j in (1...n) {
                    print("\(i) * \(j) = \(i * j)")
                }
                print()
            }
        } else {
            print("Введите число больше нуля")
        }
    }
}
