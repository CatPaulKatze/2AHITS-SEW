import at.htlhl.sew2.array2d.ArrayManipulator;

void main() {
    int[][] testArray = {{4, 2, 3, 1}, {3, 2, 1}, {5, 2, 3, 4, 1}};
    IO.print("TestArray [");
    for (int[] row : testArray) {
        IO.print(" [");
        for (int col : row) {
            IO.print(" " + col);
        }
        IO.print(" ]");
    }
    IO.println(" ]");

    int[][] nonMutating = ArrayManipulator.swapFirstAndLastElementOfEachRowNonMutating(testArray);
    IO.print("Non Mutating [");
    for (int[] row : nonMutating) {
        IO.print(" [");
        for (int col : row) {
            IO.print(" " + col);
        }
        IO.print(" ]");
    }
    IO.println(" ]");

    ArrayManipulator.swapFirstAndLastElementOfEachRowInPlace(testArray);
    IO.print("inPlace [");
    for (int[] row : testArray) {
        IO.print(" [");
        for (int col : row) {
            IO.print(" " + col);
        }
        IO.print(" ]");
    }
    IO.println(" ]");
}
