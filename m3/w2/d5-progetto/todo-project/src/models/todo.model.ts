export class Todo {
  public id: number;
  public title: string;
  public isCompleted: boolean;
  constructor(id: number, title: string, isCompleted: boolean){
    this.id = id;
    this.title = title;
    this.isCompleted = isCompleted;

  }
}
