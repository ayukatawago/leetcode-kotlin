import sys
import os


def create_file(path: str, problem_number: str, class_name: str, is_test: bool):
    if is_test:
        file_name = f"{class_name}Test"
    else:
        file_name = class_name
    with open(f"{path}/{file_name}.kt", mode='w') as f:
        f.write(f"package leetcode.problem{problem_number}\n")
        f.write("\n")
        if is_test:
            f.write("import kotlin.test.Test\n")
            f.write("\n")
        f.write(f"class {file_name} {{\n")
        if is_test:
            f.write(f"\tprivate val target = {class_name}()\n")
            f.write('\n')
            f.write('\t@Test\n')
            f.write('\tfun test1() {\n')
            f.write('\n')
            f.write('\t}\n')
        f.write("}\n")


def create_kotlin_problem(number, class_name):
    zero_filled_number = number.zfill(4)

    problem_path = f"src/main/kotlin/leetcode/problem{zero_filled_number}"
    test_path = f"src/test/kotlin/leetcode/problem{zero_filled_number}"
    print(problem_path)
    print(test_path)
    if not os.path.exists(problem_path):
        os.makedirs(problem_path)
    if not os.path.exists(test_path):
        os.makedirs(test_path)

    create_file(problem_path, zero_filled_number, class_name, False)
    create_file(test_path, zero_filled_number, class_name, True)


def convert_word(word: str):
    if word == "II":
        return str(2)
    elif word == "III":
        return str(3)
    elif word == "IV":
        return str(4)
    else:
        return word.capitalize()


if __name__ == '__main__':
    args = sys.argv
    if len(args) < 3:
        print('Missing argument')
        exit(1)

    number = args[1].strip('.')
    if not number.isdigit():
        print('Invalid argument')
        exit(1)

    name = "".join([convert_word(x) for x in args[2:]])
    create_kotlin_problem(number, name)
