def variables_and_data_types():
    # Variables and Data Types
    name = "John"
    age = 30
    is_student = False

    print("Name:", name)
    print("Age:", age)
    print("Is Student:", is_student)

def operators():
    # Operators
    x = 10
    y = 3

    print("Addition:", x + y)
    print("Subtraction:", x - y)
    print("Multiplication:", x * y)
    print("Division:", x / y)
    print("Floor Division:", x // y)
    print("Modulus:", x % y)
    print("Exponentiation:", x ** y)
    print("Greater than:", x > y)
    print("Less than:", x < y)
    print("Equal to:", x == y)

def control_flow():
    # Control Flow
    x = 10

    if x > 0:
        print("Positive")
    elif x < 0:
        print("Negative")
    else:
        print("Zero")

    for i in range(5):
        print(i)

    while x > 0:
        print(x)
        x -= 1

def data_structures():
   
    # Lists
    my_list = [1, 2, 3, 4, 5]
    print("List:", my_list)

    # Tuples
    my_tuple = (1, 2, 3, 4, 5)
    print("Tuple:", my_tuple)

    # Dictionaries
    my_dict = {'a': 1, 'b': 2, 'c': 3}
    print("Dictionary:", my_dict)

    # Sets
    my_set = {1, 2, 3, 4, 5}
    print("Set:", my_set)

def main():
    while True:
        print("\nChoose an option:")
        print("1. Variables and Data Types")
        print("2. Operators")
        print("3. Control Flow")
        print("4. Data Structures")
        print("5. Quit")

        choice = input("Enter your choice: ").strip()

        if choice == '1':
            variables_and_data_types()
        elif choice == '2':
            operators()
        elif choice == '3':
            control_flow()
        elif choice == '4':
            data_structures()
        elif choice == '5':
            print("Exiting...")
            break
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()
