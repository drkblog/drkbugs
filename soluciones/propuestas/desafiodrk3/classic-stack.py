def validate(input):
    stack = []
    for item in input:
        if is_opening(item):
            if can_open(item, None if not stack else stack[-1]):
                stack.append(item)
            else:
                print('Error {}'.format(item))
                return
        elif is_closing(item):
            previous = stack.pop()
            if not closes(item, previous):
                print('Error {}'.format(item))
                return
        else:
            print('Invalid item {}'.format(item))
            return
    print('Ok')

def is_opening(item):
    return item == '{' or  item == '[' or item == '('

def is_closing(item):
    return item == '}' or item == ']' or item == ')'

def closes(item, counterpart):
    return (item == '}' and counterpart == '{') \
        or (item == ']' and counterpart == '[') \
        or (item == ')' and counterpart == '(')

def can_open(item, previous):
    return item == previous \
        or (item == '{' and previous == None) \
        or (item == '[' and (previous == '{')) \
        or (item == '(' and (previous == '['))

validate("{[()]}")