.class Lcom/facebook/orca/contacts/favorites/ad;
.super Ljava/lang/Object;
.source "FavoritesEditPickerView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/contacts/favorites/ac;


# direct methods
.method constructor <init>(Lcom/facebook/orca/contacts/favorites/ac;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/facebook/orca/contacts/favorites/ad;->a:Lcom/facebook/orca/contacts/favorites/ac;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ad;->a:Lcom/facebook/orca/contacts/favorites/ac;

    invoke-static {v0}, Lcom/facebook/orca/contacts/favorites/ac;->a(Lcom/facebook/orca/contacts/favorites/ac;)Lcom/facebook/orca/contacts/favorites/af;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lcom/facebook/orca/contacts/favorites/ad;->a:Lcom/facebook/orca/contacts/favorites/ac;

    invoke-static {v0}, Lcom/facebook/orca/contacts/favorites/ac;->a(Lcom/facebook/orca/contacts/favorites/ac;)Lcom/facebook/orca/contacts/favorites/af;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/orca/contacts/favorites/af;->a()V

    .line 51
    :cond_0
    return-void
.end method
