package src;

class box {
    int width;
    int height;
    int length;
    int volume;

    void volume(int height, int length, int width) {
        volume = width * height * length;
    }
}