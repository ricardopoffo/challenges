def count_decimal_of_integer(n):
    """
    Counts the number of decimal places in a given integer.

    Parameters:
    n (int): The integer to count the decimal places of.

    Returns:
    int: The number of decimal places in the integer.
    """
    result = 0
    while n > 0:
        n = n // 10
        result += 1

    return result

print(count_decimal_of_integer(544000))