package ru.spbau.turaevT.drunkard.objects;

/**
 * Character is a static and active object
 */
public interface ICharacter extends IActiveObject, IGameObject {
    void processColliding(Column object);
    void processColliding(Drunkard object);
    void processColliding(Bottle object);
}
