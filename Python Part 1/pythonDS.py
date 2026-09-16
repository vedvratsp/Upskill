def lists():
    # Lists
    ved_list = [1, 2, 3, 4, 5]
    print("Original List:", ved_list)

    # Add an element to the end of the list
    ved_list.append(6)
    print("After appending 6:", ved_list)

    # Insert an element at a specific index
    ved_list.insert(2, 10)
    print("After inserting 10 at index 2:", ved_list)

    # Remove the first occurrence of a value
    ved_list.remove(4)
    print("After removing the first occurrence of 4:", ved_list)

    # Pop an element from a specific index
    popped_element = ved_list.pop(1)
    print("Popped element from index 1:", popped_element)
    print("List after popping:", ved_list)

    # Extend the list with another list
    ved_list.extend([7, 8, 9])
    print("After extending with [7, 8, 9]:", ved_list)

def tuples():
    # Tuples
    ved_tuple = (1, 2, 3, 4, 5)
    print("Original Tuple:", ved_tuple)

    # Tuple slicing
    print("Sliced Tuple:", ved_tuple[1:4])

def dictionaries():
    # Dictionaries
    ved_dict = {'a': 1, 'b': 2, 'c': 3}
    print("Original Dictionary:", ved_dict)

    # Accessing values by keys
    print("Value for key 'b':", ved_dict['b'])

    # Adding a new key-value pair
    ved_dict['d'] = 4
    print("After adding key 'd':", ved_dict)

    # Removing a key-value pair
    del ved_dict['a']
    print("After removing key 'a':", ved_dict)

def sets():
    # Sets
    ved_set = {1, 2, 3, 4, 5}
    print("Original Set:", ved_set)

    # Adding elements to a set
    ved_set.add(6)
    print("After adding 6:", ved_set)

    # Removing an element from a set
    ved_set.remove(3)
    print("After removing 3:", ved_set)

def main():
    while True:
        print("\nChoose an option:")
        print("1. Lists")
        print("2. Tuples")
        print("3. Dictionaries")
        print("4. Sets")
        print("5. Quit")

        choice = input("Enter your choice: ").strip()

        if choice == '1':
            lists()
        elif choice == '2':
            tuples()
        elif choice == '3':
            dictionaries()
        elif choice == '4':
            sets()
        elif choice == '5':
            print("Exiting...")
            break
        else:
            print("Invalid choice. Please try again.")

if __name__ == "__main__":
    main()
