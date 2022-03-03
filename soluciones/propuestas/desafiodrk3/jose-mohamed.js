function test(input) {
  let countP = 0
  let countSB = 0
  let countCB = 0
  for (let i = 0; i < input.length; i++) {
    switch (input[i]) {
      case '(':
        countP++
        break
      case ')':
        countP--
        if (countP < 0) {
          return false
        }
        break
      case '[':
        countSB++
        if (countP > 0) {
          return false
        }
        break
      case ']':
        countSB--
        if (countP !== 0 || countSB < 0) {
          return false
        }
        break
      case '{':
        countCB++
        if (countSB > 0 || countP > 0) {
          return false
        }
        break
      case '}':
        countCB--
        if (countP !== 0 || countSB !== 0 || countCB < 0) {
          return false
        }
        break
      default:
        return false
    }
  }
   
  if (countP !== 0 || countSB !== 0 || countCB !== 0) {
    return false
  }
  return true
}

console.log(test("{()[]}"));
console.log(test("{(()())}{[(()())][]}"));
console.log(test("{[]}"));
console.log(test("{{}{}}"));
console.log(test("(())"));